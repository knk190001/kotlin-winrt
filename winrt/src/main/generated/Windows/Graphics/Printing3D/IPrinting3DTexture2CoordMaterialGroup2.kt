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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPrinting3DTexture2CoordMaterialGroup2.ABI::class)
@Signature("{69fbdbba-b12e-429b-8386-df5284f6e80f}")
@Guid("69fbdbbab12e429b8386df5284f6e80f")
@WinRTInterface("69fbdbbab12e429b8386df5284f6e80f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrinting3DTexture2CoordMaterialGroup2.ByReference::class)
public interface IPrinting3DTexture2CoordMaterialGroup2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Texture(): Printing3DModelTexture?

  @InterfaceMethod(1)
  public fun put_Texture(value: Printing3DModelTexture?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrinting3DTexture2CoordMaterialGroup2> {
    public override fun getValue() =
        ABI.makeIPrinting3DTexture2CoordMaterialGroup2(pointer.getPointer(0))

    public fun setValue(value: IPrinting3DTexture2CoordMaterialGroup2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrinting3DTexture2CoordMaterialGroup2 {
    public val __390934009_Ptr: Pointer?

    public val _390934009_VtblPtr: Pointer?
      get() = __390934009_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Texture(): Printing3DModelTexture? {
      val fnPtr = _390934009_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Printing3DModelTexture>()
      val hr = fn.invokeHR(arrayOf(__390934009_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Printing3DModelTexture>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Texture(value: Printing3DModelTexture?): Unit {
      val fnPtr = _390934009_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__390934009_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrinting3DTexture2CoordMaterialGroup2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __390934009_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrinting3DTexture2CoordMaterialGroup2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("69fbdbbab12e429b8386df5284f6e80f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrinting3DTexture2CoordMaterialGroup2(ptr: Pointer?): WithDefault =
        IPrinting3DTexture2CoordMaterialGroup2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrinting3DTexture2CoordMaterialGroup2 {
      val address = segment.toRawLongValue()
      return makeIPrinting3DTexture2CoordMaterialGroup2(Pointer(address))
    }

    public override fun toNative(obj: IPrinting3DTexture2CoordMaterialGroup2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__390934009_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrinting3DTexture2CoordMaterialGroup2):
        Array<IPrinting3DTexture2CoordMaterialGroup2?> = (elements as
        Array<IPrinting3DTexture2CoordMaterialGroup2?>).castToImpl<IPrinting3DTexture2CoordMaterialGroup2,IPrinting3DTexture2CoordMaterialGroup2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrinting3DTexture2CoordMaterialGroup2?> =
        arrayOfNulls<IPrinting3DTexture2CoordMaterialGroup2_Impl>(size) as
        Array<IPrinting3DTexture2CoordMaterialGroup2?>
  }
}
