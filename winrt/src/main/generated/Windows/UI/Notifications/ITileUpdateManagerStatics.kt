package Windows.UI.Notifications

import Windows.Data.Xml.Dom.XmlDocument
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

@ABIMarker(ITileUpdateManagerStatics.ABI::class)
@Signature("{da159e5d-3ea9-4986-8d84-b09d5e12276d}")
@Guid("da159e5d3ea949868d84b09d5e12276d")
@WinRTInterface("da159e5d3ea949868d84b09d5e12276d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITileUpdateManagerStatics.ByReference::class)
public interface ITileUpdateManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateTileUpdaterForApplication(): TileUpdater?

  @InterfaceMethod(1)
  public fun CreateTileUpdaterForApplication(applicationId: String?): TileUpdater?

  @InterfaceMethod(2)
  public fun CreateTileUpdaterForSecondaryTile(tileId: String?): TileUpdater?

  @InterfaceMethod(3)
  public fun GetTemplateContent(type: TileTemplateType?): XmlDocument?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITileUpdateManagerStatics> {
    public override fun getValue() = ABI.makeITileUpdateManagerStatics(pointer.getPointer(0))

    public fun setValue(value: ITileUpdateManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITileUpdateManagerStatics {
    public val __1152783551_Ptr: Pointer?

    public val _1152783551_VtblPtr: Pointer?
      get() = __1152783551_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateTileUpdaterForApplication(): TileUpdater? {
      val fnPtr = _1152783551_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TileUpdater>()
      val hr = fn.invokeHR(arrayOf(__1152783551_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TileUpdater>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateTileUpdaterForApplication(applicationId: String?): TileUpdater? {
      val fnPtr = _1152783551_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TileUpdater>()
      val hr = fn.invokeHR(arrayOf(__1152783551_Ptr, marshalToNative(applicationId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TileUpdater>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateTileUpdaterForSecondaryTile(tileId: String?): TileUpdater? {
      val fnPtr = _1152783551_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TileUpdater>()
      val hr = fn.invokeHR(arrayOf(__1152783551_Ptr, marshalToNative(tileId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TileUpdater>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetTemplateContent(type: TileTemplateType?): XmlDocument? {
      val fnPtr = _1152783551_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlDocument>()
      val hr = fn.invokeHR(arrayOf(__1152783551_Ptr, marshalToNative(type), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlDocument>(result.getValue())
      return resultValue
    }
  }

  public class ITileUpdateManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1152783551_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITileUpdateManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("da159e5d3ea949868d84b09d5e12276d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITileUpdateManagerStatics(ptr: Pointer?): WithDefault =
        ITileUpdateManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITileUpdateManagerStatics {
      val address = segment.toRawLongValue()
      return makeITileUpdateManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: ITileUpdateManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1152783551_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITileUpdateManagerStatics):
        Array<ITileUpdateManagerStatics?> = (elements as
        Array<ITileUpdateManagerStatics?>).castToImpl<ITileUpdateManagerStatics,ITileUpdateManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITileUpdateManagerStatics?> =
        arrayOfNulls<ITileUpdateManagerStatics_Impl>(size) as Array<ITileUpdateManagerStatics?>
  }
}
