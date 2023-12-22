package Windows.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContentDialogButtonClickEventArgs.ABI::class)
@Signature("{5f34c205-8afa-4cf2-8ca0-264d73bed63d}")
@Guid("5f34c2058afa4cf28ca0264d73bed63d")
@WinRTInterface("5f34c2058afa4cf28ca0264d73bed63d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentDialogButtonClickEventArgs.ByReference::class)
public interface IContentDialogButtonClickEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Cancel(): Boolean

  @InterfaceMethod(1)
  public fun put_Cancel(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun GetDeferral(): ContentDialogButtonClickDeferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentDialogButtonClickEventArgs> {
    public override fun getValue() =
        ABI.makeIContentDialogButtonClickEventArgs(pointer.getPointer(0))

    public fun setValue(value: IContentDialogButtonClickEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentDialogButtonClickEventArgs {
    public val __1035505178_Ptr: Pointer?

    public val _1035505178_VtblPtr: Pointer?
      get() = __1035505178_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Cancel(): Boolean {
      val fnPtr = _1035505178_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1035505178_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Cancel(value: Boolean): Unit {
      val fnPtr = _1035505178_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1035505178_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetDeferral(): ContentDialogButtonClickDeferral? {
      val fnPtr = _1035505178_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentDialogButtonClickDeferral>()
      val hr = fn.invokeHR(arrayOf(__1035505178_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentDialogButtonClickDeferral>(result.getValue())
      return resultValue
    }
  }

  public class IContentDialogButtonClickEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1035505178_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentDialogButtonClickEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5f34c2058afa4cf28ca0264d73bed63d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentDialogButtonClickEventArgs(ptr: Pointer?): WithDefault =
        IContentDialogButtonClickEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentDialogButtonClickEventArgs {
      val address = segment.toRawLongValue()
      return makeIContentDialogButtonClickEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IContentDialogButtonClickEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1035505178_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentDialogButtonClickEventArgs):
        Array<IContentDialogButtonClickEventArgs?> = (elements as
        Array<IContentDialogButtonClickEventArgs?>).castToImpl<IContentDialogButtonClickEventArgs,IContentDialogButtonClickEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentDialogButtonClickEventArgs?> =
        arrayOfNulls<IContentDialogButtonClickEventArgs_Impl>(size) as
        Array<IContentDialogButtonClickEventArgs?>
  }
}
