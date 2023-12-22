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

@ABIMarker(ITileFlyoutUpdateManagerStatics.ABI::class)
@Signature("{04363b0b-1ac0-4b99-88e7-ada83e953d48}")
@Guid("04363b0b1ac04b9988e7ada83e953d48")
@WinRTInterface("04363b0b1ac04b9988e7ada83e953d48")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITileFlyoutUpdateManagerStatics.ByReference::class)
public interface ITileFlyoutUpdateManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateTileFlyoutUpdaterForApplication(): TileFlyoutUpdater?

  @InterfaceMethod(1)
  public fun CreateTileFlyoutUpdaterForApplication(applicationId: String?): TileFlyoutUpdater?

  @InterfaceMethod(2)
  public fun CreateTileFlyoutUpdaterForSecondaryTile(tileId: String?): TileFlyoutUpdater?

  @InterfaceMethod(3)
  public fun GetTemplateContent(type: TileFlyoutTemplateType?): XmlDocument?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITileFlyoutUpdateManagerStatics> {
    public override fun getValue() = ABI.makeITileFlyoutUpdateManagerStatics(pointer.getPointer(0))

    public fun setValue(value: ITileFlyoutUpdateManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITileFlyoutUpdateManagerStatics {
    public val __2135081178_Ptr: Pointer?

    public val _2135081178_VtblPtr: Pointer?
      get() = __2135081178_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateTileFlyoutUpdaterForApplication(): TileFlyoutUpdater? {
      val fnPtr = _2135081178_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TileFlyoutUpdater>()
      val hr = fn.invokeHR(arrayOf(__2135081178_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TileFlyoutUpdater>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateTileFlyoutUpdaterForApplication(applicationId: String?):
        TileFlyoutUpdater? {
      val fnPtr = _2135081178_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TileFlyoutUpdater>()
      val hr = fn.invokeHR(arrayOf(__2135081178_Ptr, marshalToNative(applicationId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TileFlyoutUpdater>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateTileFlyoutUpdaterForSecondaryTile(tileId: String?):
        TileFlyoutUpdater? {
      val fnPtr = _2135081178_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TileFlyoutUpdater>()
      val hr = fn.invokeHR(arrayOf(__2135081178_Ptr, marshalToNative(tileId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TileFlyoutUpdater>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetTemplateContent(type: TileFlyoutTemplateType?): XmlDocument? {
      val fnPtr = _2135081178_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlDocument>()
      val hr = fn.invokeHR(arrayOf(__2135081178_Ptr, marshalToNative(type), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlDocument>(result.getValue())
      return resultValue
    }
  }

  public class ITileFlyoutUpdateManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2135081178_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITileFlyoutUpdateManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("04363b0b1ac04b9988e7ada83e953d48")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITileFlyoutUpdateManagerStatics(ptr: Pointer?): WithDefault =
        ITileFlyoutUpdateManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITileFlyoutUpdateManagerStatics {
      val address = segment.toRawLongValue()
      return makeITileFlyoutUpdateManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: ITileFlyoutUpdateManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2135081178_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITileFlyoutUpdateManagerStatics):
        Array<ITileFlyoutUpdateManagerStatics?> = (elements as
        Array<ITileFlyoutUpdateManagerStatics?>).castToImpl<ITileFlyoutUpdateManagerStatics,ITileFlyoutUpdateManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITileFlyoutUpdateManagerStatics?> =
        arrayOfNulls<ITileFlyoutUpdateManagerStatics_Impl>(size) as
        Array<ITileFlyoutUpdateManagerStatics?>
  }
}
