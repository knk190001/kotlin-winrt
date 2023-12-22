package Windows.Graphics.Printing

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

@ABIMarker(IPrintTaskTargetDeviceSupport.ABI::class)
@Signature("{295d70c0-c2cb-4b7d-b0ea-93095091a220}")
@Guid("295d70c0c2cb4b7db0ea93095091a220")
@WinRTInterface("295d70c0c2cb4b7db0ea93095091a220")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintTaskTargetDeviceSupport.ByReference::class)
public interface IPrintTaskTargetDeviceSupport : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_IsPrinterTargetEnabled(value: Boolean): Unit

  @InterfaceMethod(1)
  public fun get_IsPrinterTargetEnabled(): Boolean

  @InterfaceMethod(2)
  public fun put_Is3DManufacturingTargetEnabled(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_Is3DManufacturingTargetEnabled(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintTaskTargetDeviceSupport> {
    public override fun getValue() = ABI.makeIPrintTaskTargetDeviceSupport(pointer.getPointer(0))

    public fun setValue(value: IPrintTaskTargetDeviceSupport_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintTaskTargetDeviceSupport {
    public val __1489578990_Ptr: Pointer?

    public val _1489578990_VtblPtr: Pointer?
      get() = __1489578990_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_IsPrinterTargetEnabled(value: Boolean): Unit {
      val fnPtr = _1489578990_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1489578990_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_IsPrinterTargetEnabled(): Boolean {
      val fnPtr = _1489578990_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1489578990_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_Is3DManufacturingTargetEnabled(value: Boolean): Unit {
      val fnPtr = _1489578990_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1489578990_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Is3DManufacturingTargetEnabled(): Boolean {
      val fnPtr = _1489578990_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1489578990_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPrintTaskTargetDeviceSupport_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1489578990_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintTaskTargetDeviceSupport, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("295d70c0c2cb4b7db0ea93095091a220")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintTaskTargetDeviceSupport(ptr: Pointer?): WithDefault =
        IPrintTaskTargetDeviceSupport_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintTaskTargetDeviceSupport {
      val address = segment.toRawLongValue()
      return makeIPrintTaskTargetDeviceSupport(Pointer(address))
    }

    public override fun toNative(obj: IPrintTaskTargetDeviceSupport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1489578990_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintTaskTargetDeviceSupport):
        Array<IPrintTaskTargetDeviceSupport?> = (elements as
        Array<IPrintTaskTargetDeviceSupport?>).castToImpl<IPrintTaskTargetDeviceSupport,IPrintTaskTargetDeviceSupport_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintTaskTargetDeviceSupport?> =
        arrayOfNulls<IPrintTaskTargetDeviceSupport_Impl>(size) as
        Array<IPrintTaskTargetDeviceSupport?>
  }
}
