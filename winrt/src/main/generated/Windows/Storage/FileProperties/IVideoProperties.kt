package Windows.Storage.FileProperties

import Windows.Foundation.Collections.IVector
import Windows.Foundation.IReference
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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVideoProperties.ABI::class)
@Signature("{719ae507-68de-4db8-97de-49998c059f2f}")
@Guid("719ae50768de4db897de49998c059f2f")
@WinRTInterface("719ae50768de4db897de49998c059f2f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoProperties.ByReference::class)
public interface IVideoProperties : NativeMapped, IWinRTInterface, IStorageItemExtraProperties {
  @InterfaceMethod(0)
  public fun get_Rating(): WinDef.UINT

  @InterfaceMethod(1)
  public fun put_Rating(value: WinDef.UINT): Unit

  @InterfaceMethod(2)
  public fun get_Keywords(): IVector<String?>?

  @InterfaceMethod(3)
  public fun get_Width(): WinDef.UINT

  @InterfaceMethod(4)
  public fun get_Height(): WinDef.UINT

  @InterfaceMethod(5)
  public fun get_Duration(): TimeSpan?

  @InterfaceMethod(6)
  public fun get_Latitude(): IReference<Double>?

  @InterfaceMethod(7)
  public fun get_Longitude(): IReference<Double>?

  @InterfaceMethod(8)
  public fun get_Title(): String?

  @InterfaceMethod(9)
  public fun put_Title(value: String?): Unit

  @InterfaceMethod(10)
  public fun get_Subtitle(): String?

  @InterfaceMethod(11)
  public fun put_Subtitle(value: String?): Unit

  @InterfaceMethod(12)
  public fun get_Producers(): IVector<String?>?

  @InterfaceMethod(13)
  public fun get_Publisher(): String?

  @InterfaceMethod(14)
  public fun put_Publisher(value: String?): Unit

  @InterfaceMethod(15)
  public fun get_Writers(): IVector<String?>?

  @InterfaceMethod(16)
  public fun get_Year(): WinDef.UINT

  @InterfaceMethod(17)
  public fun put_Year(value: WinDef.UINT): Unit

  @InterfaceMethod(18)
  public fun get_Bitrate(): WinDef.UINT

  @InterfaceMethod(19)
  public fun get_Directors(): IVector<String?>?

  @InterfaceMethod(20)
  public fun get_Orientation(): VideoOrientation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVideoProperties> {
    public override fun getValue() = ABI.makeIVideoProperties(pointer.getPointer(0))

    public fun setValue(value: IVideoProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoProperties, IStorageItemExtraProperties.WithDefault {
    public val __61092270_Ptr: Pointer?

    public val _61092270_VtblPtr: Pointer?
      get() = __61092270_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Rating(): WinDef.UINT {
      val fnPtr = _61092270_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__61092270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Rating(value: WinDef.UINT): Unit {
      val fnPtr = _61092270_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__61092270_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Keywords(): IVector<String?>? {
      val fnPtr = _61092270_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__61092270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Width(): WinDef.UINT {
      val fnPtr = _61092270_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__61092270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_Height(): WinDef.UINT {
      val fnPtr = _61092270_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__61092270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_Duration(): TimeSpan? {
      val fnPtr = _61092270_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__61092270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Latitude(): IReference<Double>? {
      val fnPtr = _61092270_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__61092270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Longitude(): IReference<Double>? {
      val fnPtr = _61092270_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__61092270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_Title(): String? {
      val fnPtr = _61092270_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__61092270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Title(value: String?): Unit {
      val fnPtr = _61092270_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__61092270_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Subtitle(): String? {
      val fnPtr = _61092270_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__61092270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_Subtitle(value: String?): Unit {
      val fnPtr = _61092270_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__61092270_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_Producers(): IVector<String?>? {
      val fnPtr = _61092270_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__61092270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_Publisher(): String? {
      val fnPtr = _61092270_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__61092270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_Publisher(value: String?): Unit {
      val fnPtr = _61092270_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__61092270_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_Writers(): IVector<String?>? {
      val fnPtr = _61092270_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__61092270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_Year(): WinDef.UINT {
      val fnPtr = _61092270_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__61092270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_Year(value: WinDef.UINT): Unit {
      val fnPtr = _61092270_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__61092270_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_Bitrate(): WinDef.UINT {
      val fnPtr = _61092270_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__61092270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun get_Directors(): IVector<String?>? {
      val fnPtr = _61092270_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__61092270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun get_Orientation(): VideoOrientation? {
      val fnPtr = _61092270_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoOrientation>()
      val hr = fn.invokeHR(arrayOf(__61092270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoOrientation>(result.getValue())
      return resultValue
    }
  }

  public class IVideoProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IStorageItemExtraProperties {
    public override val __1999536785_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_61092270_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __61092270_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("719ae50768de4db897de49998c059f2f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoProperties(ptr: Pointer?): WithDefault = IVideoProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVideoProperties {
      val address = segment.toRawLongValue()
      return makeIVideoProperties(Pointer(address))
    }

    public override fun toNative(obj: IVideoProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__61092270_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoProperties): Array<IVideoProperties?> = (elements as
        Array<IVideoProperties?>).castToImpl<IVideoProperties,IVideoProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoProperties?> =
        arrayOfNulls<IVideoProperties_Impl>(size) as Array<IVideoProperties?>
  }
}
