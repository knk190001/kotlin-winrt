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
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPrinting3DBaseMaterial.ABI::class)
@Signature("{d0f0e743-c50c-4bcb-9d04-fc16adcea2c9}")
@Guid("d0f0e743c50c4bcb9d04fc16adcea2c9")
@WinRTInterface("d0f0e743c50c4bcb9d04fc16adcea2c9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrinting3DBaseMaterial.ByReference::class)
public interface IPrinting3DBaseMaterial : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun put_Name(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Color(): Printing3DColorMaterial?

  @InterfaceMethod(3)
  public fun put_Color(value: Printing3DColorMaterial?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrinting3DBaseMaterial> {
    public override fun getValue() = ABI.makeIPrinting3DBaseMaterial(pointer.getPointer(0))

    public fun setValue(value: IPrinting3DBaseMaterial_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrinting3DBaseMaterial {
    public val __2000148247_Ptr: Pointer?

    public val _2000148247_VtblPtr: Pointer?
      get() = __2000148247_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _2000148247_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2000148247_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Name(value: String?): Unit {
      val fnPtr = _2000148247_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2000148247_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Color(): Printing3DColorMaterial? {
      val fnPtr = _2000148247_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Printing3DColorMaterial>()
      val hr = fn.invokeHR(arrayOf(__2000148247_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Printing3DColorMaterial>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Color(value: Printing3DColorMaterial?): Unit {
      val fnPtr = _2000148247_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2000148247_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrinting3DBaseMaterial_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2000148247_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrinting3DBaseMaterial, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d0f0e743c50c4bcb9d04fc16adcea2c9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrinting3DBaseMaterial(ptr: Pointer?): WithDefault =
        IPrinting3DBaseMaterial_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrinting3DBaseMaterial {
      val address = segment.toRawLongValue()
      return makeIPrinting3DBaseMaterial(Pointer(address))
    }

    public override fun toNative(obj: IPrinting3DBaseMaterial): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2000148247_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrinting3DBaseMaterial): Array<IPrinting3DBaseMaterial?>
        = (elements as
        Array<IPrinting3DBaseMaterial?>).castToImpl<IPrinting3DBaseMaterial,IPrinting3DBaseMaterial_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrinting3DBaseMaterial?> =
        arrayOfNulls<IPrinting3DBaseMaterial_Impl>(size) as Array<IPrinting3DBaseMaterial?>
  }
}
