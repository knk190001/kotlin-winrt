package Windows.ApplicationModel.Email

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IEmailMessageBatch.ABI::class)
@Signature("{605cd08f-25d9-4f1b-9e51-0514c0149653}")
@Guid("605cd08f25d94f1b9e510514c0149653")
@WinRTInterface("605cd08f25d94f1b9e510514c0149653")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMessageBatch.ByReference::class)
public interface IEmailMessageBatch : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Messages(): IVectorView<EmailMessage?>?

  @InterfaceMethod(1)
  public fun get_Status(): EmailBatchStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMessageBatch> {
    public override fun getValue() = ABI.makeIEmailMessageBatch(pointer.getPointer(0))

    public fun setValue(value: IEmailMessageBatch_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMessageBatch {
    public val __358346872_Ptr: Pointer?

    public val _358346872_VtblPtr: Pointer?
      get() = __358346872_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Messages(): IVectorView<EmailMessage?>? {
      val fnPtr = _358346872_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<EmailMessage?>>()
      val hr = fn.invokeHR(arrayOf(__358346872_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<EmailMessage?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Status(): EmailBatchStatus? {
      val fnPtr = _358346872_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailBatchStatus>()
      val hr = fn.invokeHR(arrayOf(__358346872_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailBatchStatus>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMessageBatch_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __358346872_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMessageBatch, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("605cd08f25d94f1b9e510514c0149653")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMessageBatch(ptr: Pointer?): WithDefault = IEmailMessageBatch_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMessageBatch {
      val address = segment.toRawLongValue()
      return makeIEmailMessageBatch(Pointer(address))
    }

    public override fun toNative(obj: IEmailMessageBatch): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__358346872_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMessageBatch): Array<IEmailMessageBatch?> =
        (elements as
        Array<IEmailMessageBatch?>).castToImpl<IEmailMessageBatch,IEmailMessageBatch_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMessageBatch?> =
        arrayOfNulls<IEmailMessageBatch_Impl>(size) as Array<IEmailMessageBatch?>
  }
}
