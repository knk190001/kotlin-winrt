package Windows.Devices.Input

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

@ABIMarker(ITouchCapabilities.ABI::class)
@Signature("{20dd55f9-13f1-46c8-9285-2c05fa3eda6f}")
@Guid("20dd55f913f146c892852c05fa3eda6f")
@WinRTInterface("20dd55f913f146c892852c05fa3eda6f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITouchCapabilities.ByReference::class)
public interface ITouchCapabilities : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TouchPresent(): Int

  @InterfaceMethod(1)
  public fun get_Contacts(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITouchCapabilities> {
    public override fun getValue() = ABI.makeITouchCapabilities(pointer.getPointer(0))

    public fun setValue(value: ITouchCapabilities_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITouchCapabilities {
    public val __597547706_Ptr: Pointer?

    public val _597547706_VtblPtr: Pointer?
      get() = __597547706_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TouchPresent(): Int {
      val fnPtr = _597547706_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__597547706_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Contacts(): WinDef.UINT {
      val fnPtr = _597547706_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__597547706_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class ITouchCapabilities_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __597547706_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITouchCapabilities, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("20dd55f913f146c892852c05fa3eda6f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITouchCapabilities(ptr: Pointer?): WithDefault = ITouchCapabilities_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITouchCapabilities {
      val address = segment.toRawLongValue()
      return makeITouchCapabilities(Pointer(address))
    }

    public override fun toNative(obj: ITouchCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__597547706_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITouchCapabilities): Array<ITouchCapabilities?> =
        (elements as
        Array<ITouchCapabilities?>).castToImpl<ITouchCapabilities,ITouchCapabilities_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITouchCapabilities?> =
        arrayOfNulls<ITouchCapabilities_Impl>(size) as Array<ITouchCapabilities?>
  }
}
