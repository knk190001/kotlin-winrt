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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INotesWindowManagerPreviewStatics.ABI::class)
@Signature("{6668cc88-0a8e-4127-a38e-995445868a78}")
@Guid("6668cc880a8e4127a38e995445868a78")
@WinRTInterface("6668cc880a8e4127a38e995445868a78")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INotesWindowManagerPreviewStatics.ByReference::class)
public interface INotesWindowManagerPreviewStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentApp(): NotesWindowManagerPreview?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INotesWindowManagerPreviewStatics> {
    public override fun getValue() =
        ABI.makeINotesWindowManagerPreviewStatics(pointer.getPointer(0))

    public fun setValue(value: INotesWindowManagerPreviewStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INotesWindowManagerPreviewStatics {
    public val __1591831665_Ptr: Pointer?

    public val _1591831665_VtblPtr: Pointer?
      get() = __1591831665_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentApp(): NotesWindowManagerPreview? {
      val fnPtr = _1591831665_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NotesWindowManagerPreview>()
      val hr = fn.invokeHR(arrayOf(__1591831665_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NotesWindowManagerPreview>(result.getValue())
      return resultValue
    }
  }

  public class INotesWindowManagerPreviewStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1591831665_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INotesWindowManagerPreviewStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6668cc880a8e4127a38e995445868a78")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINotesWindowManagerPreviewStatics(ptr: Pointer?): WithDefault =
        INotesWindowManagerPreviewStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INotesWindowManagerPreviewStatics {
      val address = segment.toRawLongValue()
      return makeINotesWindowManagerPreviewStatics(Pointer(address))
    }

    public override fun toNative(obj: INotesWindowManagerPreviewStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1591831665_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INotesWindowManagerPreviewStatics):
        Array<INotesWindowManagerPreviewStatics?> = (elements as
        Array<INotesWindowManagerPreviewStatics?>).castToImpl<INotesWindowManagerPreviewStatics,INotesWindowManagerPreviewStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INotesWindowManagerPreviewStatics?> =
        arrayOfNulls<INotesWindowManagerPreviewStatics_Impl>(size) as
        Array<INotesWindowManagerPreviewStatics?>
  }
}
