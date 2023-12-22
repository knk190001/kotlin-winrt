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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPrinting3DTexture2CoordMaterial.ABI::class)
@Signature("{8d844bfb-07e9-4986-9833-8dd3d48c6859}")
@Guid("8d844bfb07e9498698338dd3d48c6859")
@WinRTInterface("8d844bfb07e9498698338dd3d48c6859")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrinting3DTexture2CoordMaterial.ByReference::class)
public interface IPrinting3DTexture2CoordMaterial : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Texture(): Printing3DModelTexture?

  @InterfaceMethod(1)
  public fun put_Texture(value: Printing3DModelTexture?): Unit

  @InterfaceMethod(2)
  public fun get_U(): Double

  @InterfaceMethod(3)
  public fun put_U(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_V(): Double

  @InterfaceMethod(5)
  public fun put_V(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrinting3DTexture2CoordMaterial> {
    public override fun getValue() = ABI.makeIPrinting3DTexture2CoordMaterial(pointer.getPointer(0))

    public fun setValue(value: IPrinting3DTexture2CoordMaterial_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrinting3DTexture2CoordMaterial {
    public val __1205132116_Ptr: Pointer?

    public val _1205132116_VtblPtr: Pointer?
      get() = __1205132116_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Texture(): Printing3DModelTexture? {
      val fnPtr = _1205132116_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Printing3DModelTexture>()
      val hr = fn.invokeHR(arrayOf(__1205132116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Printing3DModelTexture>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Texture(value: Printing3DModelTexture?): Unit {
      val fnPtr = _1205132116_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1205132116_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_U(): Double {
      val fnPtr = _1205132116_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1205132116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_U(value: Double): Unit {
      val fnPtr = _1205132116_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1205132116_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_V(): Double {
      val fnPtr = _1205132116_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1205132116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_V(value: Double): Unit {
      val fnPtr = _1205132116_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1205132116_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrinting3DTexture2CoordMaterial_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1205132116_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrinting3DTexture2CoordMaterial, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8d844bfb07e9498698338dd3d48c6859")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrinting3DTexture2CoordMaterial(ptr: Pointer?): WithDefault =
        IPrinting3DTexture2CoordMaterial_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrinting3DTexture2CoordMaterial {
      val address = segment.toRawLongValue()
      return makeIPrinting3DTexture2CoordMaterial(Pointer(address))
    }

    public override fun toNative(obj: IPrinting3DTexture2CoordMaterial): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1205132116_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrinting3DTexture2CoordMaterial):
        Array<IPrinting3DTexture2CoordMaterial?> = (elements as
        Array<IPrinting3DTexture2CoordMaterial?>).castToImpl<IPrinting3DTexture2CoordMaterial,IPrinting3DTexture2CoordMaterial_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrinting3DTexture2CoordMaterial?> =
        arrayOfNulls<IPrinting3DTexture2CoordMaterial_Impl>(size) as
        Array<IPrinting3DTexture2CoordMaterial?>
  }
}
