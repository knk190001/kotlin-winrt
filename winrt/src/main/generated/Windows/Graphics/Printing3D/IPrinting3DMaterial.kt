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

@ABIMarker(IPrinting3DMaterial.ABI::class)
@Signature("{378db256-ed62-4952-b85b-03567d7c465e}")
@Guid("378db256ed624952b85b03567d7c465e")
@WinRTInterface("378db256ed624952b85b03567d7c465e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrinting3DMaterial.ByReference::class)
public interface IPrinting3DMaterial : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BaseGroups(): IVector<Printing3DBaseMaterialGroup?>?

  @InterfaceMethod(1)
  public fun get_ColorGroups(): IVector<Printing3DColorMaterialGroup?>?

  @InterfaceMethod(2)
  public fun get_Texture2CoordGroups(): IVector<Printing3DTexture2CoordMaterialGroup?>?

  @InterfaceMethod(3)
  public fun get_CompositeGroups(): IVector<Printing3DCompositeMaterialGroup?>?

  @InterfaceMethod(4)
  public fun get_MultiplePropertyGroups(): IVector<Printing3DMultiplePropertyMaterialGroup?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrinting3DMaterial> {
    public override fun getValue() = ABI.makeIPrinting3DMaterial(pointer.getPointer(0))

    public fun setValue(value: IPrinting3DMaterial_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrinting3DMaterial {
    public val __1720102776_Ptr: Pointer?

    public val _1720102776_VtblPtr: Pointer?
      get() = __1720102776_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BaseGroups(): IVector<Printing3DBaseMaterialGroup?>? {
      val fnPtr = _1720102776_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Printing3DBaseMaterialGroup?>>()
      val hr = fn.invokeHR(arrayOf(__1720102776_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Printing3DBaseMaterialGroup?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ColorGroups(): IVector<Printing3DColorMaterialGroup?>? {
      val fnPtr = _1720102776_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Printing3DColorMaterialGroup?>>()
      val hr = fn.invokeHR(arrayOf(__1720102776_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Printing3DColorMaterialGroup?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Texture2CoordGroups(): IVector<Printing3DTexture2CoordMaterialGroup?>? {
      val fnPtr = _1720102776_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Printing3DTexture2CoordMaterialGroup?>>()
      val hr = fn.invokeHR(arrayOf(__1720102776_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVector<Printing3DTexture2CoordMaterialGroup?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CompositeGroups(): IVector<Printing3DCompositeMaterialGroup?>? {
      val fnPtr = _1720102776_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Printing3DCompositeMaterialGroup?>>()
      val hr = fn.invokeHR(arrayOf(__1720102776_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVector<Printing3DCompositeMaterialGroup?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_MultiplePropertyGroups():
        IVector<Printing3DMultiplePropertyMaterialGroup?>? {
      val fnPtr = _1720102776_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Printing3DMultiplePropertyMaterialGroup?>>()
      val hr = fn.invokeHR(arrayOf(__1720102776_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVector<Printing3DMultiplePropertyMaterialGroup?>>(result.getValue())
      return resultValue
    }
  }

  public class IPrinting3DMaterial_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1720102776_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrinting3DMaterial, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("378db256ed624952b85b03567d7c465e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrinting3DMaterial(ptr: Pointer?): WithDefault = IPrinting3DMaterial_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrinting3DMaterial {
      val address = segment.toRawLongValue()
      return makeIPrinting3DMaterial(Pointer(address))
    }

    public override fun toNative(obj: IPrinting3DMaterial): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1720102776_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrinting3DMaterial): Array<IPrinting3DMaterial?> =
        (elements as
        Array<IPrinting3DMaterial?>).castToImpl<IPrinting3DMaterial,IPrinting3DMaterial_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrinting3DMaterial?> =
        arrayOfNulls<IPrinting3DMaterial_Impl>(size) as Array<IPrinting3DMaterial?>
  }
}
