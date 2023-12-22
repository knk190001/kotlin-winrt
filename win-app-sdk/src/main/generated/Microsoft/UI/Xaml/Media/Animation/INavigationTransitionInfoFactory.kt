package Microsoft.UI.Xaml.Media.Animation

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(INavigationTransitionInfoFactory.ABI::class)
@Signature("{c514b6ff-f6ed-572e-8392-3ea17bc7d4c4}")
@Guid("c514b6fff6ed572e83923ea17bc7d4c4")
@WinRTInterface("c514b6fff6ed572e83923ea17bc7d4c4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationTransitionInfoFactory.ByReference::class)
public interface INavigationTransitionInfoFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      NavigationTransitionInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationTransitionInfoFactory> {
    public override fun getValue() = ABI.makeINavigationTransitionInfoFactory(pointer.getPointer(0))

    public fun setValue(value: INavigationTransitionInfoFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationTransitionInfoFactory {
    public val __20927704_Ptr: Pointer?

    public val _20927704_VtblPtr: Pointer?
      get() = __20927704_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        NavigationTransitionInfo? {
      val fnPtr = _20927704_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationTransitionInfo>()
      val hr = fn.invokeHR(arrayOf(__20927704_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationTransitionInfo>(result.getValue())
      return resultValue
    }
  }

  public class INavigationTransitionInfoFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __20927704_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationTransitionInfoFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c514b6fff6ed572e83923ea17bc7d4c4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationTransitionInfoFactory(ptr: Pointer?): WithDefault =
        INavigationTransitionInfoFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationTransitionInfoFactory {
      val address = segment.toRawLongValue()
      return makeINavigationTransitionInfoFactory(Pointer(address))
    }

    public override fun toNative(obj: INavigationTransitionInfoFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__20927704_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationTransitionInfoFactory):
        Array<INavigationTransitionInfoFactory?> = (elements as
        Array<INavigationTransitionInfoFactory?>).castToImpl<INavigationTransitionInfoFactory,INavigationTransitionInfoFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationTransitionInfoFactory?> =
        arrayOfNulls<INavigationTransitionInfoFactory_Impl>(size) as
        Array<INavigationTransitionInfoFactory?>
  }
}
