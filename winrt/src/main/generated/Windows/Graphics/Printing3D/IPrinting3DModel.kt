package Windows.Graphics.Printing3D

import Windows.Foundation.Collections.IMap
import Windows.Foundation.Collections.IVector
import Windows.Foundation.IAsyncAction
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

@ABIMarker(IPrinting3DModel.ABI::class)
@Signature("{2d012ef0-52fb-919a-77b0-4b1a3b80324f}")
@Guid("2d012ef052fb919a77b04b1a3b80324f")
@WinRTInterface("2d012ef052fb919a77b04b1a3b80324f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrinting3DModel.ByReference::class)
public interface IPrinting3DModel : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Unit(): Printing3DModelUnit?

  @InterfaceMethod(1)
  public fun put_Unit(value: Printing3DModelUnit?): Unit

  @InterfaceMethod(2)
  public fun get_Textures(): IVector<Printing3DModelTexture?>?

  @InterfaceMethod(3)
  public fun get_Meshes(): IVector<Printing3DMesh?>?

  @InterfaceMethod(4)
  public fun get_Components(): IVector<Printing3DComponent?>?

  @InterfaceMethod(5)
  public fun get_Material(): Printing3DMaterial?

  @InterfaceMethod(6)
  public fun put_Material(value: Printing3DMaterial?): Unit

  @InterfaceMethod(7)
  public fun get_Build(): Printing3DComponent?

  @InterfaceMethod(8)
  public fun put_Build(value: Printing3DComponent?): Unit

  @InterfaceMethod(9)
  public fun get_Version(): String?

  @InterfaceMethod(10)
  public fun put_Version(value: String?): Unit

  @InterfaceMethod(11)
  public fun get_RequiredExtensions(): IVector<String?>?

  @InterfaceMethod(12)
  public fun get_Metadata(): IMap<String?, String?>?

  @InterfaceMethod(13)
  public fun RepairAsync(): IAsyncAction?

  @InterfaceMethod(14)
  public fun Clone(): Printing3DModel?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrinting3DModel> {
    public override fun getValue() = ABI.makeIPrinting3DModel(pointer.getPointer(0))

    public fun setValue(value: IPrinting3DModel_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrinting3DModel {
    public val __1245169032_Ptr: Pointer?

    public val _1245169032_VtblPtr: Pointer?
      get() = __1245169032_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Unit(): Printing3DModelUnit? {
      val fnPtr = _1245169032_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Printing3DModelUnit>()
      val hr = fn.invokeHR(arrayOf(__1245169032_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Printing3DModelUnit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Unit(value: Printing3DModelUnit?): Unit {
      val fnPtr = _1245169032_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1245169032_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Textures(): IVector<Printing3DModelTexture?>? {
      val fnPtr = _1245169032_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Printing3DModelTexture?>>()
      val hr = fn.invokeHR(arrayOf(__1245169032_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Printing3DModelTexture?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Meshes(): IVector<Printing3DMesh?>? {
      val fnPtr = _1245169032_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Printing3DMesh?>>()
      val hr = fn.invokeHR(arrayOf(__1245169032_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Printing3DMesh?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Components(): IVector<Printing3DComponent?>? {
      val fnPtr = _1245169032_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Printing3DComponent?>>()
      val hr = fn.invokeHR(arrayOf(__1245169032_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Printing3DComponent?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Material(): Printing3DMaterial? {
      val fnPtr = _1245169032_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Printing3DMaterial>()
      val hr = fn.invokeHR(arrayOf(__1245169032_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Printing3DMaterial>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_Material(value: Printing3DMaterial?): Unit {
      val fnPtr = _1245169032_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1245169032_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_Build(): Printing3DComponent? {
      val fnPtr = _1245169032_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Printing3DComponent>()
      val hr = fn.invokeHR(arrayOf(__1245169032_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Printing3DComponent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_Build(value: Printing3DComponent?): Unit {
      val fnPtr = _1245169032_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1245169032_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_Version(): String? {
      val fnPtr = _1245169032_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1245169032_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_Version(value: String?): Unit {
      val fnPtr = _1245169032_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1245169032_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_RequiredExtensions(): IVector<String?>? {
      val fnPtr = _1245169032_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1245169032_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_Metadata(): IMap<String?, String?>? {
      val fnPtr = _1245169032_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, String?>>()
      val hr = fn.invokeHR(arrayOf(__1245169032_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?, String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun RepairAsync(): IAsyncAction? {
      val fnPtr = _1245169032_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1245169032_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun Clone(): Printing3DModel? {
      val fnPtr = _1245169032_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Printing3DModel>()
      val hr = fn.invokeHR(arrayOf(__1245169032_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Printing3DModel>(result.getValue())
      return resultValue
    }
  }

  public class IPrinting3DModel_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1245169032_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrinting3DModel, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2d012ef052fb919a77b04b1a3b80324f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrinting3DModel(ptr: Pointer?): WithDefault = IPrinting3DModel_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrinting3DModel {
      val address = segment.toRawLongValue()
      return makeIPrinting3DModel(Pointer(address))
    }

    public override fun toNative(obj: IPrinting3DModel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1245169032_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrinting3DModel): Array<IPrinting3DModel?> = (elements as
        Array<IPrinting3DModel?>).castToImpl<IPrinting3DModel,IPrinting3DModel_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrinting3DModel?> =
        arrayOfNulls<IPrinting3DModel_Impl>(size) as Array<IPrinting3DModel?>
  }
}
