package Windows.UI.Input.Spatial

import Windows.UI.Input.Spatial.ISpatialInteractionSourceState.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(ISpatialInteractionSourceState2.ABI::class)
@Signature("{45f6d0bd-1773-492e-9ba3-8ac1cbe77c08}")
@Guid("45f6d0bd1773492e9ba38ac1cbe77c08")
@WinRTInterface("45f6d0bd1773492e9ba38ac1cbe77c08")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialInteractionSourceState2.ByReference::class)
public interface ISpatialInteractionSourceState2 : NativeMapped, IWinRTInterface,
    ISpatialInteractionSourceState {
  @InterfaceMethod(0)
  public fun get_IsSelectPressed(): Boolean

  @InterfaceMethod(1)
  public fun get_IsMenuPressed(): Boolean

  @InterfaceMethod(2)
  public fun get_IsGrasped(): Boolean

  @InterfaceMethod(3)
  public fun get_SelectPressedValue(): Double

  @InterfaceMethod(4)
  public fun get_ControllerProperties(): SpatialInteractionControllerProperties?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialInteractionSourceState2> {
    public override fun getValue() = ABI.makeISpatialInteractionSourceState2(pointer.getPointer(0))

    public fun setValue(value: ISpatialInteractionSourceState2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialInteractionSourceState2,
      ISpatialInteractionSourceState.WithDefault {
    public val __832526622_Ptr: Pointer?

    public val _832526622_VtblPtr: Pointer?
      get() = __832526622_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSelectPressed(): Boolean {
      val fnPtr = _832526622_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__832526622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsMenuPressed(): Boolean {
      val fnPtr = _832526622_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__832526622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsGrasped(): Boolean {
      val fnPtr = _832526622_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__832526622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_SelectPressedValue(): Double {
      val fnPtr = _832526622_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__832526622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_ControllerProperties(): SpatialInteractionControllerProperties? {
      val fnPtr = _832526622_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialInteractionControllerProperties>()
      val hr = fn.invokeHR(arrayOf(__832526622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialInteractionControllerProperties>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialInteractionSourceState2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISpatialInteractionSourceState {
    public override val __996687024_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_832526622_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __832526622_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialInteractionSourceState2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("45f6d0bd1773492e9ba38ac1cbe77c08")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialInteractionSourceState2(ptr: Pointer?): WithDefault =
        ISpatialInteractionSourceState2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialInteractionSourceState2 {
      val address = segment.toRawLongValue()
      return makeISpatialInteractionSourceState2(Pointer(address))
    }

    public override fun toNative(obj: ISpatialInteractionSourceState2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__832526622_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialInteractionSourceState2):
        Array<ISpatialInteractionSourceState2?> = (elements as
        Array<ISpatialInteractionSourceState2?>).castToImpl<ISpatialInteractionSourceState2,ISpatialInteractionSourceState2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialInteractionSourceState2?> =
        arrayOfNulls<ISpatialInteractionSourceState2_Impl>(size) as
        Array<ISpatialInteractionSourceState2?>
  }
}
