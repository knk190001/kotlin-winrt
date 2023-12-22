package Windows.Graphics.Printing3D

import Windows.Foundation.IAsyncOperation
import Windows.Foundation.IAsyncOperationWithProgress
import Windows.Foundation.TimeSpan
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPrinting3DModel2.ABI::class)
@Signature("{c92069c7-c841-47f3-a84e-a149fd08b657}")
@Guid("c92069c7c84147f3a84ea149fd08b657")
@WinRTInterface("c92069c7c84147f3a84ea149fd08b657")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrinting3DModel2.ByReference::class)
public interface IPrinting3DModel2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryPartialRepairAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(1)
  public fun TryPartialRepairAsync(maxWaitTime: TimeSpan?): IAsyncOperation<Boolean>?

  @InterfaceMethod(2)
  public fun TryReduceFacesAsync(): IAsyncOperationWithProgress<Boolean, Double>?

  @InterfaceMethod(3)
  public fun TryReduceFacesAsync(printing3DFaceReductionOptions: Printing3DFaceReductionOptions?):
      IAsyncOperationWithProgress<Boolean, Double>?

  @InterfaceMethod(4)
  public fun TryReduceFacesAsync(printing3DFaceReductionOptions: Printing3DFaceReductionOptions?,
      maxWait: TimeSpan?): IAsyncOperationWithProgress<Boolean, Double>?

  @InterfaceMethod(5)
  public fun RepairWithProgressAsync(): IAsyncOperationWithProgress<Boolean, Double>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrinting3DModel2> {
    public override fun getValue() = ABI.makeIPrinting3DModel2(pointer.getPointer(0))

    public fun setValue(value: IPrinting3DModel2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrinting3DModel2 {
    public val __54465722_Ptr: Pointer?

    public val _54465722_VtblPtr: Pointer?
      get() = __54465722_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryPartialRepairAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _54465722_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__54465722_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryPartialRepairAsync(maxWaitTime: TimeSpan?): IAsyncOperation<Boolean>? {
      val fnPtr = _54465722_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__54465722_Ptr, marshalToNative(maxWaitTime), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun TryReduceFacesAsync(): IAsyncOperationWithProgress<Boolean, Double>? {
      val fnPtr = _54465722_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<Boolean, Double>>()
      val hr = fn.invokeHR(arrayOf(__54465722_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<Boolean,
          Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override
        fun TryReduceFacesAsync(printing3DFaceReductionOptions: Printing3DFaceReductionOptions?):
        IAsyncOperationWithProgress<Boolean, Double>? {
      val fnPtr = _54465722_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<Boolean, Double>>()
      val hr = fn.invokeHR(arrayOf(__54465722_Ptr, marshalToNative(printing3DFaceReductionOptions),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<Boolean,
          Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override
        fun TryReduceFacesAsync(printing3DFaceReductionOptions: Printing3DFaceReductionOptions?,
        maxWait: TimeSpan?): IAsyncOperationWithProgress<Boolean, Double>? {
      val fnPtr = _54465722_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<Boolean, Double>>()
      val hr = fn.invokeHR(arrayOf(__54465722_Ptr, marshalToNative(printing3DFaceReductionOptions),
          marshalToNative(maxWait), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<Boolean,
          Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun RepairWithProgressAsync(): IAsyncOperationWithProgress<Boolean, Double>? {
      val fnPtr = _54465722_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<Boolean, Double>>()
      val hr = fn.invokeHR(arrayOf(__54465722_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<Boolean,
          Double>>(result.getValue())
      return resultValue
    }
  }

  public class IPrinting3DModel2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __54465722_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrinting3DModel2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c92069c7c84147f3a84ea149fd08b657")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrinting3DModel2(ptr: Pointer?): WithDefault = IPrinting3DModel2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrinting3DModel2 {
      val address = segment.toRawLongValue()
      return makeIPrinting3DModel2(Pointer(address))
    }

    public override fun toNative(obj: IPrinting3DModel2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__54465722_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrinting3DModel2): Array<IPrinting3DModel2?> = (elements
        as Array<IPrinting3DModel2?>).castToImpl<IPrinting3DModel2,IPrinting3DModel2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrinting3DModel2?> =
        arrayOfNulls<IPrinting3DModel2_Impl>(size) as Array<IPrinting3DModel2?>
  }
}
