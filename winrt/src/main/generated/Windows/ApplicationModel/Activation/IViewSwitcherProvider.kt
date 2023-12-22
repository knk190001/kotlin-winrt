package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IActivatedEventArgs.ABI.IID
import Windows.UI.ViewManagement.ActivationViewSwitcher
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IViewSwitcherProvider.ABI::class)
@Signature("{33f288a6-5c2c-4d27-bac7-7536088f1219}")
@Guid("33f288a65c2c4d27bac77536088f1219")
@WinRTInterface("33f288a65c2c4d27bac77536088f1219")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IViewSwitcherProvider.ByReference::class)
public interface IViewSwitcherProvider : NativeMapped, IWinRTInterface, IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_ViewSwitcher(): ActivationViewSwitcher?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IViewSwitcherProvider> {
    public override fun getValue() = ABI.makeIViewSwitcherProvider(pointer.getPointer(0))

    public fun setValue(value: IViewSwitcherProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IViewSwitcherProvider, IActivatedEventArgs.WithDefault {
    public val __1905429824_Ptr: Pointer?

    public val _1905429824_VtblPtr: Pointer?
      get() = __1905429824_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ViewSwitcher(): ActivationViewSwitcher? {
      val fnPtr = _1905429824_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ActivationViewSwitcher>()
      val hr = fn.invokeHR(arrayOf(__1905429824_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ActivationViewSwitcher>(result.getValue())
      return resultValue
    }
  }

  public class IViewSwitcherProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1905429824_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1905429824_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IViewSwitcherProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("33f288a65c2c4d27bac77536088f1219")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIViewSwitcherProvider(ptr: Pointer?): WithDefault =
        IViewSwitcherProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IViewSwitcherProvider {
      val address = segment.toRawLongValue()
      return makeIViewSwitcherProvider(Pointer(address))
    }

    public override fun toNative(obj: IViewSwitcherProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1905429824_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IViewSwitcherProvider): Array<IViewSwitcherProvider?> =
        (elements as
        Array<IViewSwitcherProvider?>).castToImpl<IViewSwitcherProvider,IViewSwitcherProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IViewSwitcherProvider?> =
        arrayOfNulls<IViewSwitcherProvider_Impl>(size) as Array<IViewSwitcherProvider?>
  }
}
