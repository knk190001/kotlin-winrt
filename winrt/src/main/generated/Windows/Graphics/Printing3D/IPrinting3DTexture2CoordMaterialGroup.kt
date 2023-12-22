package Windows.Graphics.Printing3D

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IPrinting3DTexture2CoordMaterialGroup.ABI::class)
@Signature("{627d7ca7-6d90-4fb9-9fc4-9feff3dfa892}")
@Guid("627d7ca76d904fb99fc49feff3dfa892")
@WinRTInterface("627d7ca76d904fb99fc49feff3dfa892")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrinting3DTexture2CoordMaterialGroup.ByReference::class)
public interface IPrinting3DTexture2CoordMaterialGroup : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Texture2Coords(): IVector<Printing3DTexture2CoordMaterial?>?

  @InterfaceMethod(1)
  public fun get_MaterialGroupId(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrinting3DTexture2CoordMaterialGroup> {
    public override fun getValue() =
        ABI.makeIPrinting3DTexture2CoordMaterialGroup(pointer.getPointer(0))

    public fun setValue(value: IPrinting3DTexture2CoordMaterialGroup_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrinting3DTexture2CoordMaterialGroup {
    public val __982442101_Ptr: Pointer?

    public val _982442101_VtblPtr: Pointer?
      get() = __982442101_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Texture2Coords(): IVector<Printing3DTexture2CoordMaterial?>? {
      val fnPtr = _982442101_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Printing3DTexture2CoordMaterial?>>()
      val hr = fn.invokeHR(arrayOf(__982442101_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVector<Printing3DTexture2CoordMaterial?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MaterialGroupId(): WinDef.UINT {
      val fnPtr = _982442101_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__982442101_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IPrinting3DTexture2CoordMaterialGroup_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __982442101_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrinting3DTexture2CoordMaterialGroup, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("627d7ca76d904fb99fc49feff3dfa892")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrinting3DTexture2CoordMaterialGroup(ptr: Pointer?): WithDefault =
        IPrinting3DTexture2CoordMaterialGroup_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrinting3DTexture2CoordMaterialGroup {
      val address = segment.toRawLongValue()
      return makeIPrinting3DTexture2CoordMaterialGroup(Pointer(address))
    }

    public override fun toNative(obj: IPrinting3DTexture2CoordMaterialGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__982442101_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrinting3DTexture2CoordMaterialGroup):
        Array<IPrinting3DTexture2CoordMaterialGroup?> = (elements as
        Array<IPrinting3DTexture2CoordMaterialGroup?>).castToImpl<IPrinting3DTexture2CoordMaterialGroup,IPrinting3DTexture2CoordMaterialGroup_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrinting3DTexture2CoordMaterialGroup?> =
        arrayOfNulls<IPrinting3DTexture2CoordMaterialGroup_Impl>(size) as
        Array<IPrinting3DTexture2CoordMaterialGroup?>
  }
}
