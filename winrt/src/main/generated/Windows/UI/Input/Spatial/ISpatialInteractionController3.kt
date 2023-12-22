package Windows.UI.Input.Spatial

import Windows.Devices.Power.BatteryReport
import Windows.UI.Input.Spatial.ISpatialInteractionController2.ABI.IID
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpatialInteractionController3.ABI::class)
@Signature("{628466a0-9d91-4a0b-888d-165e670a8cd5}")
@Guid("628466a09d914a0b888d165e670a8cd5")
@WinRTInterface("628466a09d914a0b888d165e670a8cd5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialInteractionController3.ByReference::class)
public interface ISpatialInteractionController3 : NativeMapped, IWinRTInterface,
    ISpatialInteractionController2, ISpatialInteractionController {
  @InterfaceMethod(0)
  public fun TryGetBatteryReport(): BatteryReport?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialInteractionController3> {
    public override fun getValue() = ABI.makeISpatialInteractionController3(pointer.getPointer(0))

    public fun setValue(value: ISpatialInteractionController3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialInteractionController3,
      ISpatialInteractionController2.WithDefault, ISpatialInteractionController.WithDefault {
    public val __1679461937_Ptr: Pointer?

    public val _1679461937_VtblPtr: Pointer?
      get() = __1679461937_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryGetBatteryReport(): BatteryReport? {
      val fnPtr = _1679461937_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BatteryReport>()
      val hr = fn.invokeHR(arrayOf(__1679461937_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BatteryReport>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialInteractionController3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISpatialInteractionController2,
      ISpatialInteractionController {
    public override val __1679461936_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1679461937_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __192723522_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(ISpatialInteractionController.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1679461937_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1679461937_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialInteractionController3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("628466a09d914a0b888d165e670a8cd5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialInteractionController3(ptr: Pointer?): WithDefault =
        ISpatialInteractionController3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialInteractionController3 {
      val address = segment.toRawLongValue()
      return makeISpatialInteractionController3(Pointer(address))
    }

    public override fun toNative(obj: ISpatialInteractionController3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1679461937_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialInteractionController3):
        Array<ISpatialInteractionController3?> = (elements as
        Array<ISpatialInteractionController3?>).castToImpl<ISpatialInteractionController3,ISpatialInteractionController3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialInteractionController3?> =
        arrayOfNulls<ISpatialInteractionController3_Impl>(size) as
        Array<ISpatialInteractionController3?>
  }
}
