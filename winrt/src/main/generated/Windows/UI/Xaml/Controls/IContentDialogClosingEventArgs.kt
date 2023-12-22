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

@ABIMarker(IContentDialogClosingEventArgs.ABI::class)
@Signature("{db3c1c34-3bbf-47d4-be4f-c9ec115918b9}")
@Guid("db3c1c343bbf47d4be4fc9ec115918b9")
@WinRTInterface("db3c1c343bbf47d4be4fc9ec115918b9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentDialogClosingEventArgs.ByReference::class)
public interface IContentDialogClosingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Result(): ContentDialogResult?

  @InterfaceMethod(1)
  public fun get_Cancel(): Boolean

  @InterfaceMethod(2)
  public fun put_Cancel(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun GetDeferral(): ContentDialogClosingDeferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentDialogClosingEventArgs> {
    public override fun getValue() = ABI.makeIContentDialogClosingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IContentDialogClosingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentDialogClosingEventArgs {
    public val __1163525113_Ptr: Pointer?

    public val _1163525113_VtblPtr: Pointer?
      get() = __1163525113_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Result(): ContentDialogResult? {
      val fnPtr = _1163525113_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentDialogResult>()
      val hr = fn.invokeHR(arrayOf(__1163525113_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentDialogResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Cancel(): Boolean {
      val fnPtr = _1163525113_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1163525113_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_Cancel(value: Boolean): Unit {
      val fnPtr = _1163525113_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1163525113_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun GetDeferral(): ContentDialogClosingDeferral? {
      val fnPtr = _1163525113_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentDialogClosingDeferral>()
      val hr = fn.invokeHR(arrayOf(__1163525113_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentDialogClosingDeferral>(result.getValue())
      return resultValue
    }
  }

  public class IContentDialogClosingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1163525113_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentDialogClosingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("db3c1c343bbf47d4be4fc9ec115918b9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentDialogClosingEventArgs(ptr: Pointer?): WithDefault =
        IContentDialogClosingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentDialogClosingEventArgs {
      val address = segment.toRawLongValue()
      return makeIContentDialogClosingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IContentDialogClosingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1163525113_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentDialogClosingEventArgs):
        Array<IContentDialogClosingEventArgs?> = (elements as
        Array<IContentDialogClosingEventArgs?>).castToImpl<IContentDialogClosingEventArgs,IContentDialogClosingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentDialogClosingEventArgs?> =
        arrayOfNulls<IContentDialogClosingEventArgs_Impl>(size) as
        Array<IContentDialogClosingEventArgs?>
  }
}
