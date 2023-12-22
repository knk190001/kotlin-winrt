package Windows.ApplicationModel.Store.Preview

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IStorePreviewProductInfo.ABI::class)
@Signature("{1937dbb3-6c01-4c9d-85cd-5babaac2b351}")
@Guid("1937dbb36c014c9d85cd5babaac2b351")
@WinRTInterface("1937dbb36c014c9d85cd5babaac2b351")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorePreviewProductInfo.ByReference::class)
public interface IStorePreviewProductInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProductId(): String?

  @InterfaceMethod(1)
  public fun get_ProductType(): String?

  @InterfaceMethod(2)
  public fun get_Title(): String?

  @InterfaceMethod(3)
  public fun get_Description(): String?

  @InterfaceMethod(4)
  public fun get_SkuInfoList(): IVectorView<StorePreviewSkuInfo?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorePreviewProductInfo> {
    public override fun getValue() = ABI.makeIStorePreviewProductInfo(pointer.getPointer(0))

    public fun setValue(value: IStorePreviewProductInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorePreviewProductInfo {
    public val __1205822050_Ptr: Pointer?

    public val _1205822050_VtblPtr: Pointer?
      get() = __1205822050_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProductId(): String? {
      val fnPtr = _1205822050_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1205822050_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ProductType(): String? {
      val fnPtr = _1205822050_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1205822050_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Title(): String? {
      val fnPtr = _1205822050_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1205822050_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Description(): String? {
      val fnPtr = _1205822050_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1205822050_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_SkuInfoList(): IVectorView<StorePreviewSkuInfo?>? {
      val fnPtr = _1205822050_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<StorePreviewSkuInfo?>>()
      val hr = fn.invokeHR(arrayOf(__1205822050_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<StorePreviewSkuInfo?>>(result.getValue())
      return resultValue
    }
  }

  public class IStorePreviewProductInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1205822050_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorePreviewProductInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1937dbb36c014c9d85cd5babaac2b351")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorePreviewProductInfo(ptr: Pointer?): WithDefault =
        IStorePreviewProductInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorePreviewProductInfo {
      val address = segment.toRawLongValue()
      return makeIStorePreviewProductInfo(Pointer(address))
    }

    public override fun toNative(obj: IStorePreviewProductInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1205822050_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorePreviewProductInfo):
        Array<IStorePreviewProductInfo?> = (elements as
        Array<IStorePreviewProductInfo?>).castToImpl<IStorePreviewProductInfo,IStorePreviewProductInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorePreviewProductInfo?> =
        arrayOfNulls<IStorePreviewProductInfo_Impl>(size) as Array<IStorePreviewProductInfo?>
  }
}
