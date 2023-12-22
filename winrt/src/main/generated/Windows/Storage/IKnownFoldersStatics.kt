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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IKnownFoldersStatics.ABI::class)
@Signature("{5a2a7520-4802-452d-9ad9-4351ada7ec35}")
@Guid("5a2a75204802452d9ad94351ada7ec35")
@WinRTInterface("5a2a75204802452d9ad94351ada7ec35")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKnownFoldersStatics.ByReference::class)
public interface IKnownFoldersStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MusicLibrary(): StorageFolder?

  @InterfaceMethod(1)
  public fun get_PicturesLibrary(): StorageFolder?

  @InterfaceMethod(2)
  public fun get_VideosLibrary(): StorageFolder?

  @InterfaceMethod(3)
  public fun get_DocumentsLibrary(): StorageFolder?

  @InterfaceMethod(4)
  public fun get_HomeGroup(): StorageFolder?

  @InterfaceMethod(5)
  public fun get_RemovableDevices(): StorageFolder?

  @InterfaceMethod(6)
  public fun get_MediaServerDevices(): StorageFolder?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKnownFoldersStatics> {
    public override fun getValue() = ABI.makeIKnownFoldersStatics(pointer.getPointer(0))

    public fun setValue(value: IKnownFoldersStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKnownFoldersStatics {
    public val __2050055978_Ptr: Pointer?

    public val _2050055978_VtblPtr: Pointer?
      get() = __2050055978_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MusicLibrary(): StorageFolder? {
      val fnPtr = _2050055978_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__2050055978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PicturesLibrary(): StorageFolder? {
      val fnPtr = _2050055978_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__2050055978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_VideosLibrary(): StorageFolder? {
      val fnPtr = _2050055978_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__2050055978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DocumentsLibrary(): StorageFolder? {
      val fnPtr = _2050055978_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__2050055978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_HomeGroup(): StorageFolder? {
      val fnPtr = _2050055978_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__2050055978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_RemovableDevices(): StorageFolder? {
      val fnPtr = _2050055978_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__2050055978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_MediaServerDevices(): StorageFolder? {
      val fnPtr = _2050055978_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__2050055978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }
  }

  public class IKnownFoldersStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2050055978_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKnownFoldersStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5a2a75204802452d9ad94351ada7ec35")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKnownFoldersStatics(ptr: Pointer?): WithDefault = IKnownFoldersStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKnownFoldersStatics {
      val address = segment.toRawLongValue()
      return makeIKnownFoldersStatics(Pointer(address))
    }

    public override fun toNative(obj: IKnownFoldersStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2050055978_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKnownFoldersStatics): Array<IKnownFoldersStatics?> =
        (elements as
        Array<IKnownFoldersStatics?>).castToImpl<IKnownFoldersStatics,IKnownFoldersStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKnownFoldersStatics?> =
        arrayOfNulls<IKnownFoldersStatics_Impl>(size) as Array<IKnownFoldersStatics?>
  }
}
