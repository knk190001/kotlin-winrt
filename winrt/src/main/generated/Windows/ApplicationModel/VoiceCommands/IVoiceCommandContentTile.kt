package Windows.ApplicationModel.VoiceCommands

import Windows.Storage.IStorageFile
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IVoiceCommandContentTile.ABI::class)
@Signature("{3eefe9f0-b8c7-4c76-a0de-1607895ee327}")
@Guid("3eefe9f0b8c74c76a0de1607895ee327")
@WinRTInterface("3eefe9f0b8c74c76a0de1607895ee327")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVoiceCommandContentTile.ByReference::class)
public interface IVoiceCommandContentTile : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Title(): String?

  @InterfaceMethod(1)
  public fun put_Title(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_TextLine1(): String?

  @InterfaceMethod(3)
  public fun put_TextLine1(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_TextLine2(): String?

  @InterfaceMethod(5)
  public fun put_TextLine2(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_TextLine3(): String?

  @InterfaceMethod(7)
  public fun put_TextLine3(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_Image(): IStorageFile?

  @InterfaceMethod(9)
  public fun put_Image(value: IStorageFile?): Unit

  @InterfaceMethod(10)
  public fun get_AppContext(): IUnknown?

  @InterfaceMethod(11)
  public fun put_AppContext(value: IUnknown?): Unit

  @InterfaceMethod(12)
  public fun get_AppLaunchArgument(): String?

  @InterfaceMethod(13)
  public fun put_AppLaunchArgument(value: String?): Unit

  @InterfaceMethod(14)
  public fun get_ContentTileType(): VoiceCommandContentTileType?

  @InterfaceMethod(15)
  public fun put_ContentTileType(value: VoiceCommandContentTileType?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVoiceCommandContentTile> {
    public override fun getValue() = ABI.makeIVoiceCommandContentTile(pointer.getPointer(0))

    public fun setValue(value: IVoiceCommandContentTile_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVoiceCommandContentTile {
    public val __1335334421_Ptr: Pointer?

    public val _1335334421_VtblPtr: Pointer?
      get() = __1335334421_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Title(): String? {
      val fnPtr = _1335334421_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1335334421_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Title(value: String?): Unit {
      val fnPtr = _1335334421_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1335334421_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TextLine1(): String? {
      val fnPtr = _1335334421_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1335334421_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_TextLine1(value: String?): Unit {
      val fnPtr = _1335334421_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1335334421_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_TextLine2(): String? {
      val fnPtr = _1335334421_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1335334421_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_TextLine2(value: String?): Unit {
      val fnPtr = _1335334421_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1335334421_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_TextLine3(): String? {
      val fnPtr = _1335334421_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1335334421_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_TextLine3(value: String?): Unit {
      val fnPtr = _1335334421_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1335334421_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Image(): IStorageFile? {
      val fnPtr = _1335334421_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IStorageFile>()
      val hr = fn.invokeHR(arrayOf(__1335334421_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IStorageFile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Image(value: IStorageFile?): Unit {
      val fnPtr = _1335334421_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1335334421_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_AppContext(): IUnknown? {
      val fnPtr = _1335334421_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1335334421_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_AppContext(value: IUnknown?): Unit {
      val fnPtr = _1335334421_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1335334421_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_AppLaunchArgument(): String? {
      val fnPtr = _1335334421_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1335334421_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_AppLaunchArgument(value: String?): Unit {
      val fnPtr = _1335334421_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1335334421_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_ContentTileType(): VoiceCommandContentTileType? {
      val fnPtr = _1335334421_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VoiceCommandContentTileType>()
      val hr = fn.invokeHR(arrayOf(__1335334421_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VoiceCommandContentTileType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_ContentTileType(value: VoiceCommandContentTileType?): Unit {
      val fnPtr = _1335334421_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1335334421_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVoiceCommandContentTile_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1335334421_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVoiceCommandContentTile, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3eefe9f0b8c74c76a0de1607895ee327")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVoiceCommandContentTile(ptr: Pointer?): WithDefault =
        IVoiceCommandContentTile_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVoiceCommandContentTile {
      val address = segment.toRawLongValue()
      return makeIVoiceCommandContentTile(Pointer(address))
    }

    public override fun toNative(obj: IVoiceCommandContentTile): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1335334421_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVoiceCommandContentTile):
        Array<IVoiceCommandContentTile?> = (elements as
        Array<IVoiceCommandContentTile?>).castToImpl<IVoiceCommandContentTile,IVoiceCommandContentTile_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVoiceCommandContentTile?> =
        arrayOfNulls<IVoiceCommandContentTile_Impl>(size) as Array<IVoiceCommandContentTile?>
  }
}
