package Windows.ApplicationModel.Email

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

@ABIMarker(IEmailMailboxCreateFolderResult.ABI::class)
@Signature("{b228557f-2885-4998-b595-8a2d374ce950}")
@Guid("b228557f28854998b5958a2d374ce950")
@WinRTInterface("b228557f28854998b5958a2d374ce950")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxCreateFolderResult.ByReference::class)
public interface IEmailMailboxCreateFolderResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): EmailMailboxCreateFolderStatus?

  @InterfaceMethod(1)
  public fun get_Folder(): EmailFolder?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxCreateFolderResult> {
    public override fun getValue() = ABI.makeIEmailMailboxCreateFolderResult(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxCreateFolderResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxCreateFolderResult {
    public val __828412982_Ptr: Pointer?

    public val _828412982_VtblPtr: Pointer?
      get() = __828412982_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): EmailMailboxCreateFolderStatus? {
      val fnPtr = _828412982_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxCreateFolderStatus>()
      val hr = fn.invokeHR(arrayOf(__828412982_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMailboxCreateFolderStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Folder(): EmailFolder? {
      val fnPtr = _828412982_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailFolder>()
      val hr = fn.invokeHR(arrayOf(__828412982_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailFolder>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailboxCreateFolderResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __828412982_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxCreateFolderResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b228557f28854998b5958a2d374ce950")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxCreateFolderResult(ptr: Pointer?): WithDefault =
        IEmailMailboxCreateFolderResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMailboxCreateFolderResult {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxCreateFolderResult(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxCreateFolderResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__828412982_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxCreateFolderResult):
        Array<IEmailMailboxCreateFolderResult?> = (elements as
        Array<IEmailMailboxCreateFolderResult?>).castToImpl<IEmailMailboxCreateFolderResult,IEmailMailboxCreateFolderResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxCreateFolderResult?> =
        arrayOfNulls<IEmailMailboxCreateFolderResult_Impl>(size) as
        Array<IEmailMailboxCreateFolderResult?>
  }
}
