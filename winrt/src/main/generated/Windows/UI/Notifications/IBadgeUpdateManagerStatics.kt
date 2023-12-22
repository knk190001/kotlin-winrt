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

@ABIMarker(IBadgeUpdateManagerStatics.ABI::class)
@Signature("{33400faa-6dd5-4105-aebc-9b50fca492da}")
@Guid("33400faa6dd54105aebc9b50fca492da")
@WinRTInterface("33400faa6dd54105aebc9b50fca492da")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBadgeUpdateManagerStatics.ByReference::class)
public interface IBadgeUpdateManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateBadgeUpdaterForApplication(): BadgeUpdater?

  @InterfaceMethod(1)
  public fun CreateBadgeUpdaterForApplication(applicationId: String?): BadgeUpdater?

  @InterfaceMethod(2)
  public fun CreateBadgeUpdaterForSecondaryTile(tileId: String?): BadgeUpdater?

  @InterfaceMethod(3)
  public fun GetTemplateContent(type: BadgeTemplateType?): XmlDocument?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBadgeUpdateManagerStatics> {
    public override fun getValue() = ABI.makeIBadgeUpdateManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IBadgeUpdateManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBadgeUpdateManagerStatics {
    public val __1049581140_Ptr: Pointer?

    public val _1049581140_VtblPtr: Pointer?
      get() = __1049581140_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateBadgeUpdaterForApplication(): BadgeUpdater? {
      val fnPtr = _1049581140_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BadgeUpdater>()
      val hr = fn.invokeHR(arrayOf(__1049581140_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BadgeUpdater>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateBadgeUpdaterForApplication(applicationId: String?): BadgeUpdater? {
      val fnPtr = _1049581140_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BadgeUpdater>()
      val hr = fn.invokeHR(arrayOf(__1049581140_Ptr, marshalToNative(applicationId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BadgeUpdater>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateBadgeUpdaterForSecondaryTile(tileId: String?): BadgeUpdater? {
      val fnPtr = _1049581140_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BadgeUpdater>()
      val hr = fn.invokeHR(arrayOf(__1049581140_Ptr, marshalToNative(tileId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BadgeUpdater>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetTemplateContent(type: BadgeTemplateType?): XmlDocument? {
      val fnPtr = _1049581140_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlDocument>()
      val hr = fn.invokeHR(arrayOf(__1049581140_Ptr, marshalToNative(type), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlDocument>(result.getValue())
      return resultValue
    }
  }

  public class IBadgeUpdateManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1049581140_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBadgeUpdateManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("33400faa6dd54105aebc9b50fca492da")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBadgeUpdateManagerStatics(ptr: Pointer?): WithDefault =
        IBadgeUpdateManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBadgeUpdateManagerStatics {
      val address = segment.toRawLongValue()
      return makeIBadgeUpdateManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IBadgeUpdateManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1049581140_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBadgeUpdateManagerStatics):
        Array<IBadgeUpdateManagerStatics?> = (elements as
        Array<IBadgeUpdateManagerStatics?>).castToImpl<IBadgeUpdateManagerStatics,IBadgeUpdateManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBadgeUpdateManagerStatics?> =
        arrayOfNulls<IBadgeUpdateManagerStatics_Impl>(size) as Array<IBadgeUpdateManagerStatics?>
  }
}
