package Windows.Devices.SmartCards

import Windows.Foundation.IReference
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISmartCardAutomaticResponseApdu2.ABI::class)
@Signature("{44aebb14-559d-4531-4e51-89db6fa8a57a}")
@Guid("44aebb14559d45314e5189db6fa8a57a")
@WinRTInterface("44aebb14559d45314e5189db6fa8a57a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardAutomaticResponseApdu2.ByReference::class)
public interface ISmartCardAutomaticResponseApdu2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InputState(): IReference<WinDef.UINT>?

  @InterfaceMethod(1)
  public fun put_InputState(value: IReference<WinDef.UINT>?): Unit

  @InterfaceMethod(2)
  public fun get_OutputState(): IReference<WinDef.UINT>?

  @InterfaceMethod(3)
  public fun put_OutputState(value: IReference<WinDef.UINT>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardAutomaticResponseApdu2> {
    public override fun getValue() = ABI.makeISmartCardAutomaticResponseApdu2(pointer.getPointer(0))

    public fun setValue(value: ISmartCardAutomaticResponseApdu2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardAutomaticResponseApdu2 {
    public val __467876812_Ptr: Pointer?

    public val _467876812_VtblPtr: Pointer?
      get() = __467876812_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InputState(): IReference<WinDef.UINT>? {
      val fnPtr = _467876812_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__467876812_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_InputState(value: IReference<WinDef.UINT>?): Unit {
      val fnPtr = _467876812_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__467876812_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_OutputState(): IReference<WinDef.UINT>? {
      val fnPtr = _467876812_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__467876812_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_OutputState(value: IReference<WinDef.UINT>?): Unit {
      val fnPtr = _467876812_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__467876812_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISmartCardAutomaticResponseApdu2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __467876812_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardAutomaticResponseApdu2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("44aebb14559d45314e5189db6fa8a57a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardAutomaticResponseApdu2(ptr: Pointer?): WithDefault =
        ISmartCardAutomaticResponseApdu2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardAutomaticResponseApdu2 {
      val address = segment.toRawLongValue()
      return makeISmartCardAutomaticResponseApdu2(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardAutomaticResponseApdu2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__467876812_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardAutomaticResponseApdu2):
        Array<ISmartCardAutomaticResponseApdu2?> = (elements as
        Array<ISmartCardAutomaticResponseApdu2?>).castToImpl<ISmartCardAutomaticResponseApdu2,ISmartCardAutomaticResponseApdu2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardAutomaticResponseApdu2?> =
        arrayOfNulls<ISmartCardAutomaticResponseApdu2_Impl>(size) as
        Array<ISmartCardAutomaticResponseApdu2?>
  }
}
