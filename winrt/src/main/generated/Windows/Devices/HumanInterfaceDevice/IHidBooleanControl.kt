package Windows.Devices.HumanInterfaceDevice

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IHidBooleanControl.ABI::class)
@Signature("{524df48a-3695-408c-bba2-e2eb5abfbc20}")
@Guid("524df48a3695408cbba2e2eb5abfbc20")
@WinRTInterface("524df48a3695408cbba2e2eb5abfbc20")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHidBooleanControl.ByReference::class)
public interface IHidBooleanControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_UsagePage(): WinDef.USHORT

  @InterfaceMethod(2)
  public fun get_UsageId(): WinDef.USHORT

  @InterfaceMethod(3)
  public fun get_IsActive(): Boolean

  @InterfaceMethod(4)
  public fun put_IsActive(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun get_ControlDescription(): HidBooleanControlDescription?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHidBooleanControl> {
    public override fun getValue() = ABI.makeIHidBooleanControl(pointer.getPointer(0))

    public fun setValue(value: IHidBooleanControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHidBooleanControl {
    public val __2090605069_Ptr: Pointer?

    public val _2090605069_VtblPtr: Pointer?
      get() = __2090605069_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): WinDef.UINT {
      val fnPtr = _2090605069_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__2090605069_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_UsagePage(): WinDef.USHORT {
      val fnPtr = _2090605069_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__2090605069_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_UsageId(): WinDef.USHORT {
      val fnPtr = _2090605069_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__2090605069_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsActive(): Boolean {
      val fnPtr = _2090605069_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2090605069_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_IsActive(value: Boolean): Unit {
      val fnPtr = _2090605069_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2090605069_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_ControlDescription(): HidBooleanControlDescription? {
      val fnPtr = _2090605069_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HidBooleanControlDescription>()
      val hr = fn.invokeHR(arrayOf(__2090605069_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HidBooleanControlDescription>(result.getValue())
      return resultValue
    }
  }

  public class IHidBooleanControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2090605069_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHidBooleanControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("524df48a3695408cbba2e2eb5abfbc20")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHidBooleanControl(ptr: Pointer?): WithDefault = IHidBooleanControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHidBooleanControl {
      val address = segment.toRawLongValue()
      return makeIHidBooleanControl(Pointer(address))
    }

    public override fun toNative(obj: IHidBooleanControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2090605069_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHidBooleanControl): Array<IHidBooleanControl?> =
        (elements as
        Array<IHidBooleanControl?>).castToImpl<IHidBooleanControl,IHidBooleanControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHidBooleanControl?> =
        arrayOfNulls<IHidBooleanControl_Impl>(size) as Array<IHidBooleanControl?>
  }
}
