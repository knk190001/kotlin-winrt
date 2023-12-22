package Windows.Storage.FileProperties

import Windows.Foundation.Collections.IVector
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.DateTime
import Windows.Foundation.IReference
import Windows.Storage.FileProperties.IStorageItemExtraProperties.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IImageProperties.ABI::class)
@Signature("{523c9424-fcff-4275-afee-ecdb9ab47973}")
@Guid("523c9424fcff4275afeeecdb9ab47973")
@WinRTInterface("523c9424fcff4275afeeecdb9ab47973")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImageProperties.ByReference::class)
public interface IImageProperties : NativeMapped, IWinRTInterface, IStorageItemExtraProperties {
  @InterfaceMethod(0)
  public fun get_Rating(): WinDef.UINT

  @InterfaceMethod(1)
  public fun put_Rating(value: WinDef.UINT): Unit

  @InterfaceMethod(2)
  public fun get_Keywords(): IVector<String?>?

  @InterfaceMethod(3)
  public fun get_DateTaken(): DateTime?

  @InterfaceMethod(4)
  public fun put_DateTaken(value: DateTime?): Unit

  @InterfaceMethod(5)
  public fun get_Width(): WinDef.UINT

  @InterfaceMethod(6)
  public fun get_Height(): WinDef.UINT

  @InterfaceMethod(7)
  public fun get_Title(): String?

  @InterfaceMethod(8)
  public fun put_Title(value: String?): Unit

  @InterfaceMethod(9)
  public fun get_Latitude(): IReference<Double>?

  @InterfaceMethod(10)
  public fun get_Longitude(): IReference<Double>?

  @InterfaceMethod(11)
  public fun get_CameraManufacturer(): String?

  @InterfaceMethod(12)
  public fun put_CameraManufacturer(value: String?): Unit

  @InterfaceMethod(13)
  public fun get_CameraModel(): String?

  @InterfaceMethod(14)
  public fun put_CameraModel(value: String?): Unit

  @InterfaceMethod(15)
  public fun get_Orientation(): PhotoOrientation?

  @InterfaceMethod(16)
  public fun get_PeopleNames(): IVectorView<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IImageProperties> {
    public override fun getValue() = ABI.makeIImageProperties(pointer.getPointer(0))

    public fun setValue(value: IImageProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImageProperties, IStorageItemExtraProperties.WithDefault {
    public val __1721355058_Ptr: Pointer?

    public val _1721355058_VtblPtr: Pointer?
      get() = __1721355058_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Rating(): WinDef.UINT {
      val fnPtr = _1721355058_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1721355058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Rating(value: WinDef.UINT): Unit {
      val fnPtr = _1721355058_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1721355058_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Keywords(): IVector<String?>? {
      val fnPtr = _1721355058_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1721355058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DateTaken(): DateTime? {
      val fnPtr = _1721355058_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1721355058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_DateTaken(value: DateTime?): Unit {
      val fnPtr = _1721355058_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1721355058_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Width(): WinDef.UINT {
      val fnPtr = _1721355058_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1721355058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_Height(): WinDef.UINT {
      val fnPtr = _1721355058_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1721355058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_Title(): String? {
      val fnPtr = _1721355058_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1721355058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_Title(value: String?): Unit {
      val fnPtr = _1721355058_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1721355058_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_Latitude(): IReference<Double>? {
      val fnPtr = _1721355058_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__1721355058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_Longitude(): IReference<Double>? {
      val fnPtr = _1721355058_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__1721355058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_CameraManufacturer(): String? {
      val fnPtr = _1721355058_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1721355058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun put_CameraManufacturer(value: String?): Unit {
      val fnPtr = _1721355058_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1721355058_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_CameraModel(): String? {
      val fnPtr = _1721355058_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1721355058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_CameraModel(value: String?): Unit {
      val fnPtr = _1721355058_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1721355058_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_Orientation(): PhotoOrientation? {
      val fnPtr = _1721355058_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhotoOrientation>()
      val hr = fn.invokeHR(arrayOf(__1721355058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhotoOrientation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_PeopleNames(): IVectorView<String?>? {
      val fnPtr = _1721355058_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1721355058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IImageProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IStorageItemExtraProperties {
    public override val __1999536785_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1721355058_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1721355058_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImageProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("523c9424fcff4275afeeecdb9ab47973")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImageProperties(ptr: Pointer?): WithDefault = IImageProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImageProperties {
      val address = segment.toRawLongValue()
      return makeIImageProperties(Pointer(address))
    }

    public override fun toNative(obj: IImageProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1721355058_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImageProperties): Array<IImageProperties?> = (elements as
        Array<IImageProperties?>).castToImpl<IImageProperties,IImageProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImageProperties?> =
        arrayOfNulls<IImageProperties_Impl>(size) as Array<IImageProperties?>
  }
}
