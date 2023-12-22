package Windows.Graphics.Printing3D

import Windows.Foundation.Collections.IVector
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IRandomAccessStream
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

@ABIMarker(IPrinting3D3MFPackage.ABI::class)
@Signature("{f64dd5c8-2ab7-45a9-a1b7-267e948d5b18}")
@Guid("f64dd5c82ab745a9a1b7267e948d5b18")
@WinRTInterface("f64dd5c82ab745a9a1b7267e948d5b18")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrinting3D3MFPackage.ByReference::class)
public interface IPrinting3D3MFPackage : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SaveAsync(): IAsyncOperation<IRandomAccessStream?>?

  @InterfaceMethod(1)
  public fun get_PrintTicket(): IRandomAccessStream?

  @InterfaceMethod(2)
  public fun put_PrintTicket(value: IRandomAccessStream?): Unit

  @InterfaceMethod(3)
  public fun get_ModelPart(): IRandomAccessStream?

  @InterfaceMethod(4)
  public fun put_ModelPart(value: IRandomAccessStream?): Unit

  @InterfaceMethod(5)
  public fun get_Thumbnail(): Printing3DTextureResource?

  @InterfaceMethod(6)
  public fun put_Thumbnail(value: Printing3DTextureResource?): Unit

  @InterfaceMethod(7)
  public fun get_Textures(): IVector<Printing3DTextureResource?>?

  @InterfaceMethod(8)
  public fun LoadModelFromPackageAsync(value: IRandomAccessStream?):
      IAsyncOperation<Printing3DModel?>?

  @InterfaceMethod(9)
  public fun SaveModelToPackageAsync(value: Printing3DModel?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrinting3D3MFPackage> {
    public override fun getValue() = ABI.makeIPrinting3D3MFPackage(pointer.getPointer(0))

    public fun setValue(value: IPrinting3D3MFPackage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrinting3D3MFPackage {
    public val __1545542539_Ptr: Pointer?

    public val _1545542539_VtblPtr: Pointer?
      get() = __1545542539_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SaveAsync(): IAsyncOperation<IRandomAccessStream?>? {
      val fnPtr = _1545542539_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IRandomAccessStream?>>()
      val hr = fn.invokeHR(arrayOf(__1545542539_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IRandomAccessStream?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PrintTicket(): IRandomAccessStream? {
      val fnPtr = _1545542539_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStream>()
      val hr = fn.invokeHR(arrayOf(__1545542539_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_PrintTicket(value: IRandomAccessStream?): Unit {
      val fnPtr = _1545542539_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1545542539_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_ModelPart(): IRandomAccessStream? {
      val fnPtr = _1545542539_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStream>()
      val hr = fn.invokeHR(arrayOf(__1545542539_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_ModelPart(value: IRandomAccessStream?): Unit {
      val fnPtr = _1545542539_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1545542539_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Thumbnail(): Printing3DTextureResource? {
      val fnPtr = _1545542539_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Printing3DTextureResource>()
      val hr = fn.invokeHR(arrayOf(__1545542539_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Printing3DTextureResource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_Thumbnail(value: Printing3DTextureResource?): Unit {
      val fnPtr = _1545542539_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1545542539_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_Textures(): IVector<Printing3DTextureResource?>? {
      val fnPtr = _1545542539_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Printing3DTextureResource?>>()
      val hr = fn.invokeHR(arrayOf(__1545542539_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Printing3DTextureResource?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun LoadModelFromPackageAsync(value: IRandomAccessStream?):
        IAsyncOperation<Printing3DModel?>? {
      val fnPtr = _1545542539_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Printing3DModel?>>()
      val hr = fn.invokeHR(arrayOf(__1545542539_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Printing3DModel?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun SaveModelToPackageAsync(value: Printing3DModel?): IAsyncAction? {
      val fnPtr = _1545542539_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1545542539_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IPrinting3D3MFPackage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1545542539_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrinting3D3MFPackage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f64dd5c82ab745a9a1b7267e948d5b18")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrinting3D3MFPackage(ptr: Pointer?): WithDefault =
        IPrinting3D3MFPackage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrinting3D3MFPackage {
      val address = segment.toRawLongValue()
      return makeIPrinting3D3MFPackage(Pointer(address))
    }

    public override fun toNative(obj: IPrinting3D3MFPackage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1545542539_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrinting3D3MFPackage): Array<IPrinting3D3MFPackage?> =
        (elements as
        Array<IPrinting3D3MFPackage?>).castToImpl<IPrinting3D3MFPackage,IPrinting3D3MFPackage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrinting3D3MFPackage?> =
        arrayOfNulls<IPrinting3D3MFPackage_Impl>(size) as Array<IPrinting3D3MFPackage?>
  }
}
