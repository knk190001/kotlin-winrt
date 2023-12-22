package Windows.Graphics.Printing3D

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

@ABIMarker(IPrinting3DColorMaterial.ABI::class)
@Signature("{e1899928-7ce7-4285-a35d-f145c9510c7b}")
@Guid("e18999287ce74285a35df145c9510c7b")
@WinRTInterface("e18999287ce74285a35df145c9510c7b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrinting3DColorMaterial.ByReference::class)
public interface IPrinting3DColorMaterial : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Value(): WinDef.UINT

  @InterfaceMethod(1)
  public fun put_Value(value: WinDef.UINT): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrinting3DColorMaterial> {
    public override fun getValue() = ABI.makeIPrinting3DColorMaterial(pointer.getPointer(0))

    public fun setValue(value: IPrinting3DColorMaterial_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrinting3DColorMaterial {
    public val __550476295_Ptr: Pointer?

    public val _550476295_VtblPtr: Pointer?
      get() = __550476295_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Value(): WinDef.UINT {
      val fnPtr = _550476295_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__550476295_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Value(value: WinDef.UINT): Unit {
      val fnPtr = _550476295_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__550476295_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrinting3DColorMaterial_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __550476295_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrinting3DColorMaterial, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e18999287ce74285a35df145c9510c7b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrinting3DColorMaterial(ptr: Pointer?): WithDefault =
        IPrinting3DColorMaterial_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrinting3DColorMaterial {
      val address = segment.toRawLongValue()
      return makeIPrinting3DColorMaterial(Pointer(address))
    }

    public override fun toNative(obj: IPrinting3DColorMaterial): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__550476295_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrinting3DColorMaterial):
        Array<IPrinting3DColorMaterial?> = (elements as
        Array<IPrinting3DColorMaterial?>).castToImpl<IPrinting3DColorMaterial,IPrinting3DColorMaterial_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrinting3DColorMaterial?> =
        arrayOfNulls<IPrinting3DColorMaterial_Impl>(size) as Array<IPrinting3DColorMaterial?>
  }
}
