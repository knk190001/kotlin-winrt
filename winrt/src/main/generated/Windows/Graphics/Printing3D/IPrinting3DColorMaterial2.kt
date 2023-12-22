package Windows.Graphics.Printing3D

import Windows.UI.Color
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

@ABIMarker(IPrinting3DColorMaterial2.ABI::class)
@Signature("{fab0e852-0aef-44e9-9ddd-36eeea5acd44}")
@Guid("fab0e8520aef44e99ddd36eeea5acd44")
@WinRTInterface("fab0e8520aef44e99ddd36eeea5acd44")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrinting3DColorMaterial2.ByReference::class)
public interface IPrinting3DColorMaterial2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Color(): Color?

  @InterfaceMethod(1)
  public fun put_Color(value: Color?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrinting3DColorMaterial2> {
    public override fun getValue() = ABI.makeIPrinting3DColorMaterial2(pointer.getPointer(0))

    public fun setValue(value: IPrinting3DColorMaterial2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrinting3DColorMaterial2 {
    public val __115104089_Ptr: Pointer?

    public val _115104089_VtblPtr: Pointer?
      get() = __115104089_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Color(): Color? {
      val fnPtr = _115104089_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__115104089_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Color(value: Color?): Unit {
      val fnPtr = _115104089_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__115104089_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrinting3DColorMaterial2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __115104089_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrinting3DColorMaterial2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fab0e8520aef44e99ddd36eeea5acd44")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrinting3DColorMaterial2(ptr: Pointer?): WithDefault =
        IPrinting3DColorMaterial2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrinting3DColorMaterial2 {
      val address = segment.toRawLongValue()
      return makeIPrinting3DColorMaterial2(Pointer(address))
    }

    public override fun toNative(obj: IPrinting3DColorMaterial2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__115104089_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrinting3DColorMaterial2):
        Array<IPrinting3DColorMaterial2?> = (elements as
        Array<IPrinting3DColorMaterial2?>).castToImpl<IPrinting3DColorMaterial2,IPrinting3DColorMaterial2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrinting3DColorMaterial2?> =
        arrayOfNulls<IPrinting3DColorMaterial2_Impl>(size) as Array<IPrinting3DColorMaterial2?>
  }
}
