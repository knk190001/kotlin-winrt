package Windows.Storage

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

@ABIMarker(ISystemProperties.ABI::class)
@Signature("{917a71c1-85f3-4dd1-b001-a50bfd21c8d2}")
@Guid("917a71c185f34dd1b001a50bfd21c8d2")
@WinRTInterface("917a71c185f34dd1b001a50bfd21c8d2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemProperties.ByReference::class)
public interface ISystemProperties : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Author(): String?

  @InterfaceMethod(1)
  public fun get_Comment(): String?

  @InterfaceMethod(2)
  public fun get_ItemNameDisplay(): String?

  @InterfaceMethod(3)
  public fun get_Keywords(): String?

  @InterfaceMethod(4)
  public fun get_Rating(): String?

  @InterfaceMethod(5)
  public fun get_Title(): String?

  @InterfaceMethod(6)
  public fun get_Audio(): SystemAudioProperties?

  @InterfaceMethod(7)
  public fun get_GPS(): SystemGPSProperties?

  @InterfaceMethod(8)
  public fun get_Media(): SystemMediaProperties?

  @InterfaceMethod(9)
  public fun get_Music(): SystemMusicProperties?

  @InterfaceMethod(10)
  public fun get_Photo(): SystemPhotoProperties?

  @InterfaceMethod(11)
  public fun get_Video(): SystemVideoProperties?

  @InterfaceMethod(12)
  public fun get_Image(): SystemImageProperties?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemProperties> {
    public override fun getValue() = ABI.makeISystemProperties(pointer.getPointer(0))

    public fun setValue(value: ISystemProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemProperties {
    public val __367953755_Ptr: Pointer?

    public val _367953755_VtblPtr: Pointer?
      get() = __367953755_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Author(): String? {
      val fnPtr = _367953755_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__367953755_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Comment(): String? {
      val fnPtr = _367953755_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__367953755_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ItemNameDisplay(): String? {
      val fnPtr = _367953755_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__367953755_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Keywords(): String? {
      val fnPtr = _367953755_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__367953755_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Rating(): String? {
      val fnPtr = _367953755_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__367953755_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Title(): String? {
      val fnPtr = _367953755_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__367953755_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Audio(): SystemAudioProperties? {
      val fnPtr = _367953755_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemAudioProperties>()
      val hr = fn.invokeHR(arrayOf(__367953755_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemAudioProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_GPS(): SystemGPSProperties? {
      val fnPtr = _367953755_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemGPSProperties>()
      val hr = fn.invokeHR(arrayOf(__367953755_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemGPSProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_Media(): SystemMediaProperties? {
      val fnPtr = _367953755_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemMediaProperties>()
      val hr = fn.invokeHR(arrayOf(__367953755_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemMediaProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_Music(): SystemMusicProperties? {
      val fnPtr = _367953755_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemMusicProperties>()
      val hr = fn.invokeHR(arrayOf(__367953755_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemMusicProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_Photo(): SystemPhotoProperties? {
      val fnPtr = _367953755_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemPhotoProperties>()
      val hr = fn.invokeHR(arrayOf(__367953755_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemPhotoProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_Video(): SystemVideoProperties? {
      val fnPtr = _367953755_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemVideoProperties>()
      val hr = fn.invokeHR(arrayOf(__367953755_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemVideoProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_Image(): SystemImageProperties? {
      val fnPtr = _367953755_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemImageProperties>()
      val hr = fn.invokeHR(arrayOf(__367953755_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemImageProperties>(result.getValue())
      return resultValue
    }
  }

  public class ISystemProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __367953755_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("917a71c185f34dd1b001a50bfd21c8d2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemProperties(ptr: Pointer?): WithDefault = ISystemProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemProperties {
      val address = segment.toRawLongValue()
      return makeISystemProperties(Pointer(address))
    }

    public override fun toNative(obj: ISystemProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__367953755_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemProperties): Array<ISystemProperties?> = (elements
        as Array<ISystemProperties?>).castToImpl<ISystemProperties,ISystemProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemProperties?> =
        arrayOfNulls<ISystemProperties_Impl>(size) as Array<ISystemProperties?>
  }
}
