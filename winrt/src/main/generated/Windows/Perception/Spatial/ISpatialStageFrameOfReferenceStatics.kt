package Windows.Perception.Spatial

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(ISpatialStageFrameOfReferenceStatics.ABI::class)
@Signature("{f78d5c4d-a0a4-499c-8d91-a8c965d40654}")
@Guid("f78d5c4da0a4499c8d91a8c965d40654")
@WinRTInterface("f78d5c4da0a4499c8d91a8c965d40654")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialStageFrameOfReferenceStatics.ByReference::class)
public interface ISpatialStageFrameOfReferenceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Current(): SpatialStageFrameOfReference?

  @InterfaceMethod(1)
  public fun add_CurrentChanged(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_CurrentChanged(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun RequestNewStageAsync(): IAsyncOperation<SpatialStageFrameOfReference?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialStageFrameOfReferenceStatics> {
    public override fun getValue() =
        ABI.makeISpatialStageFrameOfReferenceStatics(pointer.getPointer(0))

    public fun setValue(value: ISpatialStageFrameOfReferenceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialStageFrameOfReferenceStatics {
    public val __1021364897_Ptr: Pointer?

    public val _1021364897_VtblPtr: Pointer?
      get() = __1021364897_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Current(): SpatialStageFrameOfReference? {
      val fnPtr = _1021364897_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialStageFrameOfReference>()
      val hr = fn.invokeHR(arrayOf(__1021364897_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialStageFrameOfReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_CurrentChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1021364897_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1021364897_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_CurrentChanged(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1021364897_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021364897_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun RequestNewStageAsync(): IAsyncOperation<SpatialStageFrameOfReference?>? {
      val fnPtr = _1021364897_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SpatialStageFrameOfReference?>>()
      val hr = fn.invokeHR(arrayOf(__1021364897_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SpatialStageFrameOfReference?>>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialStageFrameOfReferenceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1021364897_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialStageFrameOfReferenceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f78d5c4da0a4499c8d91a8c965d40654")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialStageFrameOfReferenceStatics(ptr: Pointer?): WithDefault =
        ISpatialStageFrameOfReferenceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialStageFrameOfReferenceStatics {
      val address = segment.toRawLongValue()
      return makeISpatialStageFrameOfReferenceStatics(Pointer(address))
    }

    public override fun toNative(obj: ISpatialStageFrameOfReferenceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1021364897_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialStageFrameOfReferenceStatics):
        Array<ISpatialStageFrameOfReferenceStatics?> = (elements as
        Array<ISpatialStageFrameOfReferenceStatics?>).castToImpl<ISpatialStageFrameOfReferenceStatics,ISpatialStageFrameOfReferenceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialStageFrameOfReferenceStatics?> =
        arrayOfNulls<ISpatialStageFrameOfReferenceStatics_Impl>(size) as
        Array<ISpatialStageFrameOfReferenceStatics?>
  }
}
