package Windows.Devices.Input

import Windows.Devices.Haptics.SimpleHapticsController
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

@ABIMarker(IPenDevice2.ABI::class)
@Signature("{0207d327-7fb8-5566-8c34-f8342037b7f9}")
@Guid("0207d3277fb855668c34f8342037b7f9")
@WinRTInterface("0207d3277fb855668c34f8342037b7f9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPenDevice2.ByReference::class)
public interface IPenDevice2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SimpleHapticsController(): SimpleHapticsController?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPenDevice2> {
    public override fun getValue() = ABI.makeIPenDevice2(pointer.getPointer(0))

    public fun setValue(value: IPenDevice2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPenDevice2 {
    public val __1065040194_Ptr: Pointer?

    public val _1065040194_VtblPtr: Pointer?
      get() = __1065040194_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SimpleHapticsController(): SimpleHapticsController? {
      val fnPtr = _1065040194_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SimpleHapticsController>()
      val hr = fn.invokeHR(arrayOf(__1065040194_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SimpleHapticsController>(result.getValue())
      return resultValue
    }
  }

  public class IPenDevice2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1065040194_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPenDevice2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0207d3277fb855668c34f8342037b7f9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPenDevice2(ptr: Pointer?): WithDefault = IPenDevice2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPenDevice2 {
      val address = segment.toRawLongValue()
      return makeIPenDevice2(Pointer(address))
    }

    public override fun toNative(obj: IPenDevice2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1065040194_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPenDevice2): Array<IPenDevice2?> = (elements as
        Array<IPenDevice2?>).castToImpl<IPenDevice2,IPenDevice2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPenDevice2?> =
        arrayOfNulls<IPenDevice2_Impl>(size) as Array<IPenDevice2?>
  }
}
