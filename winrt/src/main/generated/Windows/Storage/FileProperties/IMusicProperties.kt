package Windows.Storage.FileProperties

import Windows.Foundation.Collections.IVector
import Windows.Foundation.TimeSpan
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMusicProperties.ABI::class)
@Signature("{bc8aab62-66ec-419a-bc5d-ca65a4cb46da}")
@Guid("bc8aab6266ec419abc5dca65a4cb46da")
@WinRTInterface("bc8aab6266ec419abc5dca65a4cb46da")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMusicProperties.ByReference::class)
public interface IMusicProperties : NativeMapped, IWinRTInterface, IStorageItemExtraProperties {
  @InterfaceMethod(0)
  public fun get_Album(): String?

  @InterfaceMethod(1)
  public fun put_Album(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Artist(): String?

  @InterfaceMethod(3)
  public fun put_Artist(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_Genre(): IVector<String?>?

  @InterfaceMethod(5)
  public fun get_TrackNumber(): WinDef.UINT

  @InterfaceMethod(6)
  public fun put_TrackNumber(value: WinDef.UINT): Unit

  @InterfaceMethod(7)
  public fun get_Title(): String?

  @InterfaceMethod(8)
  public fun put_Title(value: String?): Unit

  @InterfaceMethod(9)
  public fun get_Rating(): WinDef.UINT

  @InterfaceMethod(10)
  public fun put_Rating(value: WinDef.UINT): Unit

  @InterfaceMethod(11)
  public fun get_Duration(): TimeSpan?

  @InterfaceMethod(12)
  public fun get_Bitrate(): WinDef.UINT

  @InterfaceMethod(13)
  public fun get_AlbumArtist(): String?

  @InterfaceMethod(14)
  public fun put_AlbumArtist(value: String?): Unit

  @InterfaceMethod(15)
  public fun get_Composers(): IVector<String?>?

  @InterfaceMethod(16)
  public fun get_Conductors(): IVector<String?>?

  @InterfaceMethod(17)
  public fun get_Subtitle(): String?

  @InterfaceMethod(18)
  public fun put_Subtitle(value: String?): Unit

  @InterfaceMethod(19)
  public fun get_Producers(): IVector<String?>?

  @InterfaceMethod(20)
  public fun get_Publisher(): String?

  @InterfaceMethod(21)
  public fun put_Publisher(value: String?): Unit

  @InterfaceMethod(22)
  public fun get_Writers(): IVector<String?>?

  @InterfaceMethod(23)
  public fun get_Year(): WinDef.UINT

  @InterfaceMethod(24)
  public fun put_Year(value: WinDef.UINT): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMusicProperties> {
    public override fun getValue() = ABI.makeIMusicProperties(pointer.getPointer(0))

    public fun setValue(value: IMusicProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMusicProperties, IStorageItemExtraProperties.WithDefault {
    public val __2017059972_Ptr: Pointer?

    public val _2017059972_VtblPtr: Pointer?
      get() = __2017059972_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Album(): String? {
      val fnPtr = _2017059972_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2017059972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Album(value: String?): Unit {
      val fnPtr = _2017059972_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2017059972_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Artist(): String? {
      val fnPtr = _2017059972_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2017059972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Artist(value: String?): Unit {
      val fnPtr = _2017059972_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2017059972_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Genre(): IVector<String?>? {
      val fnPtr = _2017059972_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__2017059972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_TrackNumber(): WinDef.UINT {
      val fnPtr = _2017059972_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__2017059972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_TrackNumber(value: WinDef.UINT): Unit {
      val fnPtr = _2017059972_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2017059972_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_Title(): String? {
      val fnPtr = _2017059972_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2017059972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_Title(value: String?): Unit {
      val fnPtr = _2017059972_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2017059972_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_Rating(): WinDef.UINT {
      val fnPtr = _2017059972_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__2017059972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun put_Rating(value: WinDef.UINT): Unit {
      val fnPtr = _2017059972_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2017059972_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_Duration(): TimeSpan? {
      val fnPtr = _2017059972_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__2017059972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_Bitrate(): WinDef.UINT {
      val fnPtr = _2017059972_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__2017059972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun get_AlbumArtist(): String? {
      val fnPtr = _2017059972_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2017059972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_AlbumArtist(value: String?): Unit {
      val fnPtr = _2017059972_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2017059972_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_Composers(): IVector<String?>? {
      val fnPtr = _2017059972_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__2017059972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_Conductors(): IVector<String?>? {
      val fnPtr = _2017059972_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__2017059972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_Subtitle(): String? {
      val fnPtr = _2017059972_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2017059972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun put_Subtitle(value: String?): Unit {
      val fnPtr = _2017059972_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2017059972_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun get_Producers(): IVector<String?>? {
      val fnPtr = _2017059972_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__2017059972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun get_Publisher(): String? {
      val fnPtr = _2017059972_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2017059972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_Publisher(value: String?): Unit {
      val fnPtr = _2017059972_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2017059972_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_Writers(): IVector<String?>? {
      val fnPtr = _2017059972_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__2017059972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun get_Year(): WinDef.UINT {
      val fnPtr = _2017059972_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__2017059972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(24)
    public override fun put_Year(value: WinDef.UINT): Unit {
      val fnPtr = _2017059972_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2017059972_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMusicProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IStorageItemExtraProperties {
    public override val __1999536785_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2017059972_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2017059972_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMusicProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bc8aab6266ec419abc5dca65a4cb46da")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMusicProperties(ptr: Pointer?): WithDefault = IMusicProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMusicProperties {
      val address = segment.toRawLongValue()
      return makeIMusicProperties(Pointer(address))
    }

    public override fun toNative(obj: IMusicProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2017059972_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMusicProperties): Array<IMusicProperties?> = (elements as
        Array<IMusicProperties?>).castToImpl<IMusicProperties,IMusicProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMusicProperties?> =
        arrayOfNulls<IMusicProperties_Impl>(size) as Array<IMusicProperties?>
  }
}
