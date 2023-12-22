package Windows.ApplicationModel.Preview.Notes

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

@ABIMarker(INotesWindowManagerPreviewShowNoteOptions.ABI::class)
@Signature("{886b09d6-a6ae-4007-a56d-1ca70c84c0d2}")
@Guid("886b09d6a6ae4007a56d1ca70c84c0d2")
@WinRTInterface("886b09d6a6ae4007a56d1ca70c84c0d2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INotesWindowManagerPreviewShowNoteOptions.ByReference::class)
public interface INotesWindowManagerPreviewShowNoteOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ShowWithFocus(): Boolean

  @InterfaceMethod(1)
  public fun put_ShowWithFocus(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INotesWindowManagerPreviewShowNoteOptions> {
    public override fun getValue() =
        ABI.makeINotesWindowManagerPreviewShowNoteOptions(pointer.getPointer(0))

    public fun setValue(value: INotesWindowManagerPreviewShowNoteOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INotesWindowManagerPreviewShowNoteOptions {
    public val __854652859_Ptr: Pointer?

    public val _854652859_VtblPtr: Pointer?
      get() = __854652859_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ShowWithFocus(): Boolean {
      val fnPtr = _854652859_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__854652859_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_ShowWithFocus(value: Boolean): Unit {
      val fnPtr = _854652859_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__854652859_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class INotesWindowManagerPreviewShowNoteOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __854652859_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INotesWindowManagerPreviewShowNoteOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("886b09d6a6ae4007a56d1ca70c84c0d2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINotesWindowManagerPreviewShowNoteOptions(ptr: Pointer?): WithDefault =
        INotesWindowManagerPreviewShowNoteOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        INotesWindowManagerPreviewShowNoteOptions {
      val address = segment.toRawLongValue()
      return makeINotesWindowManagerPreviewShowNoteOptions(Pointer(address))
    }

    public override fun toNative(obj: INotesWindowManagerPreviewShowNoteOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__854652859_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INotesWindowManagerPreviewShowNoteOptions):
        Array<INotesWindowManagerPreviewShowNoteOptions?> = (elements as
        Array<INotesWindowManagerPreviewShowNoteOptions?>).castToImpl<INotesWindowManagerPreviewShowNoteOptions,INotesWindowManagerPreviewShowNoteOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INotesWindowManagerPreviewShowNoteOptions?> =
        arrayOfNulls<INotesWindowManagerPreviewShowNoteOptions_Impl>(size) as
        Array<INotesWindowManagerPreviewShowNoteOptions?>
  }
}
