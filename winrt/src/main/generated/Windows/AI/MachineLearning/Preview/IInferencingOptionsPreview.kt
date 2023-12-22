package Windows.AI.MachineLearning.Preview

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

@ABIMarker(IInferencingOptionsPreview.ABI::class)
@Signature("{47bc8205-4d36-47a9-8f68-ffcb339dd0fc}")
@Guid("47bc82054d3647a98f68ffcb339dd0fc")
@WinRTInterface("47bc82054d3647a98f68ffcb339dd0fc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInferencingOptionsPreview.ByReference::class)
public interface IInferencingOptionsPreview : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PreferredDeviceKind(): LearningModelDeviceKindPreview?

  @InterfaceMethod(1)
  public fun put_PreferredDeviceKind(value: LearningModelDeviceKindPreview?): Unit

  @InterfaceMethod(2)
  public fun get_IsTracingEnabled(): Boolean

  @InterfaceMethod(3)
  public fun put_IsTracingEnabled(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_MaxBatchSize(): Int

  @InterfaceMethod(5)
  public fun put_MaxBatchSize(value: Int): Unit

  @InterfaceMethod(6)
  public fun get_MinimizeMemoryAllocation(): Boolean

  @InterfaceMethod(7)
  public fun put_MinimizeMemoryAllocation(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_ReclaimMemoryAfterEvaluation(): Boolean

  @InterfaceMethod(9)
  public fun put_ReclaimMemoryAfterEvaluation(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInferencingOptionsPreview> {
    public override fun getValue() = ABI.makeIInferencingOptionsPreview(pointer.getPointer(0))

    public fun setValue(value: IInferencingOptionsPreview_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInferencingOptionsPreview {
    public val __516320261_Ptr: Pointer?

    public val _516320261_VtblPtr: Pointer?
      get() = __516320261_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PreferredDeviceKind(): LearningModelDeviceKindPreview? {
      val fnPtr = _516320261_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LearningModelDeviceKindPreview>()
      val hr = fn.invokeHR(arrayOf(__516320261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LearningModelDeviceKindPreview>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PreferredDeviceKind(value: LearningModelDeviceKindPreview?): Unit {
      val fnPtr = _516320261_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__516320261_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsTracingEnabled(): Boolean {
      val fnPtr = _516320261_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__516320261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsTracingEnabled(value: Boolean): Unit {
      val fnPtr = _516320261_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__516320261_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_MaxBatchSize(): Int {
      val fnPtr = _516320261_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__516320261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_MaxBatchSize(value: Int): Unit {
      val fnPtr = _516320261_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__516320261_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_MinimizeMemoryAllocation(): Boolean {
      val fnPtr = _516320261_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__516320261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_MinimizeMemoryAllocation(value: Boolean): Unit {
      val fnPtr = _516320261_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__516320261_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_ReclaimMemoryAfterEvaluation(): Boolean {
      val fnPtr = _516320261_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__516320261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_ReclaimMemoryAfterEvaluation(value: Boolean): Unit {
      val fnPtr = _516320261_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__516320261_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInferencingOptionsPreview_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __516320261_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInferencingOptionsPreview, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("47bc82054d3647a98f68ffcb339dd0fc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInferencingOptionsPreview(ptr: Pointer?): WithDefault =
        IInferencingOptionsPreview_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInferencingOptionsPreview {
      val address = segment.toRawLongValue()
      return makeIInferencingOptionsPreview(Pointer(address))
    }

    public override fun toNative(obj: IInferencingOptionsPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__516320261_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInferencingOptionsPreview):
        Array<IInferencingOptionsPreview?> = (elements as
        Array<IInferencingOptionsPreview?>).castToImpl<IInferencingOptionsPreview,IInferencingOptionsPreview_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInferencingOptionsPreview?> =
        arrayOfNulls<IInferencingOptionsPreview_Impl>(size) as Array<IInferencingOptionsPreview?>
  }
}
