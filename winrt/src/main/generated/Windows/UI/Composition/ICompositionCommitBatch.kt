package Windows.UI.Composition

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICompositionCommitBatch.ABI::class)
@Signature("{0d00dad0-ca07-4400-8c8e-cb5db08559cc}")
@Guid("0d00dad0ca0744008c8ecb5db08559cc")
@WinRTInterface("0d00dad0ca0744008c8ecb5db08559cc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionCommitBatch.ByReference::class)
public interface ICompositionCommitBatch : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsActive(): Boolean

  @InterfaceMethod(1)
  public fun get_IsEnded(): Boolean

  @InterfaceMethod(2)
  public fun add_Completed(handler: TypedEventHandler<IUnknown?,
      CompositionBatchCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_Completed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionCommitBatch> {
    public override fun getValue() = ABI.makeICompositionCommitBatch(pointer.getPointer(0))

    public fun setValue(value: ICompositionCommitBatch_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionCommitBatch {
    public val __780896615_Ptr: Pointer?

    public val _780896615_VtblPtr: Pointer?
      get() = __780896615_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsActive(): Boolean {
      val fnPtr = _780896615_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__780896615_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsEnded(): Boolean {
      val fnPtr = _780896615_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__780896615_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun add_Completed(handler: TypedEventHandler<IUnknown?,
        CompositionBatchCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _780896615_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__780896615_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_Completed(token: EventRegistrationToken?): Unit {
      val fnPtr = _780896615_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__780896615_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionCommitBatch_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __780896615_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionCommitBatch, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0d00dad0ca0744008c8ecb5db08559cc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionCommitBatch(ptr: Pointer?): WithDefault =
        ICompositionCommitBatch_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionCommitBatch {
      val address = segment.toRawLongValue()
      return makeICompositionCommitBatch(Pointer(address))
    }

    public override fun toNative(obj: ICompositionCommitBatch): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__780896615_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionCommitBatch): Array<ICompositionCommitBatch?>
        = (elements as
        Array<ICompositionCommitBatch?>).castToImpl<ICompositionCommitBatch,ICompositionCommitBatch_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionCommitBatch?> =
        arrayOfNulls<ICompositionCommitBatch_Impl>(size) as Array<ICompositionCommitBatch?>
  }
}
