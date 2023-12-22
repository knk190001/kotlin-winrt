package Windows.ApplicationModel.Wallet

import Windows.Foundation.Collections.IMap
import Windows.Foundation.DateTime
import Windows.Foundation.IReference
import Windows.Storage.Streams.IRandomAccessStreamReference
import Windows.UI.Color
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWalletItem.ABI::class)
@Signature("{20b54be8-118d-4ec4-996c-b963e7bd3e74}")
@Guid("20b54be8118d4ec4996cb963e7bd3e74")
@WinRTInterface("20b54be8118d4ec4996cb963e7bd3e74")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWalletItem.ByReference::class)
public interface IWalletItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisplayName(): String?

  @InterfaceMethod(1)
  public fun put_DisplayName(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Id(): String?

  @InterfaceMethod(3)
  public fun get_IsAcknowledged(): Boolean

  @InterfaceMethod(4)
  public fun put_IsAcknowledged(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun get_IssuerDisplayName(): String?

  @InterfaceMethod(6)
  public fun put_IssuerDisplayName(value: String?): Unit

  @InterfaceMethod(7)
  public fun get_LastUpdated(): IReference<DateTime?>?

  @InterfaceMethod(8)
  public fun put_LastUpdated(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(9)
  public fun get_Kind(): WalletItemKind?

  @InterfaceMethod(10)
  public fun get_Barcode(): WalletBarcode?

  @InterfaceMethod(11)
  public fun put_Barcode(value: WalletBarcode?): Unit

  @InterfaceMethod(12)
  public fun get_ExpirationDate(): IReference<DateTime?>?

  @InterfaceMethod(13)
  public fun put_ExpirationDate(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(14)
  public fun get_Logo159x159(): IRandomAccessStreamReference?

  @InterfaceMethod(15)
  public fun put_Logo159x159(value: IRandomAccessStreamReference?): Unit

  @InterfaceMethod(16)
  public fun get_Logo336x336(): IRandomAccessStreamReference?

  @InterfaceMethod(17)
  public fun put_Logo336x336(value: IRandomAccessStreamReference?): Unit

  @InterfaceMethod(18)
  public fun get_Logo99x99(): IRandomAccessStreamReference?

  @InterfaceMethod(19)
  public fun put_Logo99x99(value: IRandomAccessStreamReference?): Unit

  @InterfaceMethod(20)
  public fun get_DisplayMessage(): String?

  @InterfaceMethod(21)
  public fun put_DisplayMessage(value: String?): Unit

  @InterfaceMethod(22)
  public fun get_IsDisplayMessageLaunchable(): Boolean

  @InterfaceMethod(23)
  public fun put_IsDisplayMessageLaunchable(value: Boolean): Unit

  @InterfaceMethod(24)
  public fun get_LogoText(): String?

  @InterfaceMethod(25)
  public fun put_LogoText(value: String?): Unit

  @InterfaceMethod(26)
  public fun get_HeaderColor(): Color?

  @InterfaceMethod(27)
  public fun put_HeaderColor(value: Color?): Unit

  @InterfaceMethod(28)
  public fun get_BodyColor(): Color?

  @InterfaceMethod(29)
  public fun put_BodyColor(value: Color?): Unit

  @InterfaceMethod(30)
  public fun get_HeaderFontColor(): Color?

  @InterfaceMethod(31)
  public fun put_HeaderFontColor(value: Color?): Unit

  @InterfaceMethod(32)
  public fun get_BodyFontColor(): Color?

  @InterfaceMethod(33)
  public fun put_BodyFontColor(value: Color?): Unit

  @InterfaceMethod(34)
  public fun get_HeaderBackgroundImage(): IRandomAccessStreamReference?

  @InterfaceMethod(35)
  public fun put_HeaderBackgroundImage(value: IRandomAccessStreamReference?): Unit

  @InterfaceMethod(36)
  public fun get_BodyBackgroundImage(): IRandomAccessStreamReference?

  @InterfaceMethod(37)
  public fun put_BodyBackgroundImage(value: IRandomAccessStreamReference?): Unit

  @InterfaceMethod(38)
  public fun get_LogoImage(): IRandomAccessStreamReference?

  @InterfaceMethod(39)
  public fun put_LogoImage(value: IRandomAccessStreamReference?): Unit

  @InterfaceMethod(40)
  public fun get_PromotionalImage(): IRandomAccessStreamReference?

  @InterfaceMethod(41)
  public fun put_PromotionalImage(value: IRandomAccessStreamReference?): Unit

  @InterfaceMethod(42)
  public fun get_RelevantDate(): IReference<DateTime?>?

  @InterfaceMethod(43)
  public fun put_RelevantDate(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(44)
  public fun get_RelevantDateDisplayMessage(): String?

  @InterfaceMethod(45)
  public fun put_RelevantDateDisplayMessage(value: String?): Unit

  @InterfaceMethod(46)
  public fun get_TransactionHistory(): IMap<String?, WalletTransaction?>?

  @InterfaceMethod(47)
  public fun get_RelevantLocations(): IMap<String?, WalletRelevantLocation?>?

  @InterfaceMethod(48)
  public fun get_IsMoreTransactionHistoryLaunchable(): Boolean

  @InterfaceMethod(49)
  public fun put_IsMoreTransactionHistoryLaunchable(value: Boolean): Unit

  @InterfaceMethod(50)
  public fun get_DisplayProperties(): IMap<String?, WalletItemCustomProperty?>?

  @InterfaceMethod(51)
  public fun get_Verbs(): IMap<String?, WalletVerb?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IWalletItem> {
    public override fun getValue() = ABI.makeIWalletItem(pointer.getPointer(0))

    public fun setValue(value: IWalletItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWalletItem {
    public val __800127666_Ptr: Pointer?

    public val _800127666_VtblPtr: Pointer?
      get() = __800127666_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayName(): String? {
      val fnPtr = _800127666_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DisplayName(value: String?): Unit {
      val fnPtr = _800127666_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Id(): String? {
      val fnPtr = _800127666_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_IsAcknowledged(): Boolean {
      val fnPtr = _800127666_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_IsAcknowledged(value: Boolean): Unit {
      val fnPtr = _800127666_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_IssuerDisplayName(): String? {
      val fnPtr = _800127666_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_IssuerDisplayName(value: String?): Unit {
      val fnPtr = _800127666_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_LastUpdated(): IReference<DateTime?>? {
      val fnPtr = _800127666_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_LastUpdated(value: IReference<DateTime?>?): Unit {
      val fnPtr = _800127666_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_Kind(): WalletItemKind? {
      val fnPtr = _800127666_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WalletItemKind>()
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WalletItemKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_Barcode(): WalletBarcode? {
      val fnPtr = _800127666_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WalletBarcode>()
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WalletBarcode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_Barcode(value: WalletBarcode?): Unit {
      val fnPtr = _800127666_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_ExpirationDate(): IReference<DateTime?>? {
      val fnPtr = _800127666_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_ExpirationDate(value: IReference<DateTime?>?): Unit {
      val fnPtr = _800127666_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_Logo159x159(): IRandomAccessStreamReference? {
      val fnPtr = _800127666_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_Logo159x159(value: IRandomAccessStreamReference?): Unit {
      val fnPtr = _800127666_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_Logo336x336(): IRandomAccessStreamReference? {
      val fnPtr = _800127666_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_Logo336x336(value: IRandomAccessStreamReference?): Unit {
      val fnPtr = _800127666_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_Logo99x99(): IRandomAccessStreamReference? {
      val fnPtr = _800127666_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_Logo99x99(value: IRandomAccessStreamReference?): Unit {
      val fnPtr = _800127666_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_DisplayMessage(): String? {
      val fnPtr = _800127666_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_DisplayMessage(value: String?): Unit {
      val fnPtr = _800127666_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_IsDisplayMessageLaunchable(): Boolean {
      val fnPtr = _800127666_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(23)
    public override fun put_IsDisplayMessageLaunchable(value: Boolean): Unit {
      val fnPtr = _800127666_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_LogoText(): String? {
      val fnPtr = _800127666_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun put_LogoText(value: String?): Unit {
      val fnPtr = _800127666_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_HeaderColor(): Color? {
      val fnPtr = _800127666_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun put_HeaderColor(value: Color?): Unit {
      val fnPtr = _800127666_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_BodyColor(): Color? {
      val fnPtr = _800127666_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun put_BodyColor(value: Color?): Unit {
      val fnPtr = _800127666_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_HeaderFontColor(): Color? {
      val fnPtr = _800127666_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun put_HeaderFontColor(value: Color?): Unit {
      val fnPtr = _800127666_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun get_BodyFontColor(): Color? {
      val fnPtr = _800127666_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun put_BodyFontColor(value: Color?): Unit {
      val fnPtr = _800127666_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun get_HeaderBackgroundImage(): IRandomAccessStreamReference? {
      val fnPtr = _800127666_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun put_HeaderBackgroundImage(value: IRandomAccessStreamReference?): Unit {
      val fnPtr = _800127666_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun get_BodyBackgroundImage(): IRandomAccessStreamReference? {
      val fnPtr = _800127666_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun put_BodyBackgroundImage(value: IRandomAccessStreamReference?): Unit {
      val fnPtr = _800127666_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun get_LogoImage(): IRandomAccessStreamReference? {
      val fnPtr = _800127666_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun put_LogoImage(value: IRandomAccessStreamReference?): Unit {
      val fnPtr = _800127666_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun get_PromotionalImage(): IRandomAccessStreamReference? {
      val fnPtr = _800127666_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(41)
    public override fun put_PromotionalImage(value: IRandomAccessStreamReference?): Unit {
      val fnPtr = _800127666_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(42)
    public override fun get_RelevantDate(): IReference<DateTime?>? {
      val fnPtr = _800127666_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(43)
    public override fun put_RelevantDate(value: IReference<DateTime?>?): Unit {
      val fnPtr = _800127666_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(44)
    public override fun get_RelevantDateDisplayMessage(): String? {
      val fnPtr = _800127666_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(45)
    public override fun put_RelevantDateDisplayMessage(value: String?): Unit {
      val fnPtr = _800127666_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(46)
    public override fun get_TransactionHistory(): IMap<String?, WalletTransaction?>? {
      val fnPtr = _800127666_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, WalletTransaction?>>()
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?, WalletTransaction?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(47)
    public override fun get_RelevantLocations(): IMap<String?, WalletRelevantLocation?>? {
      val fnPtr = _800127666_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, WalletRelevantLocation?>>()
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?, WalletRelevantLocation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(48)
    public override fun get_IsMoreTransactionHistoryLaunchable(): Boolean {
      val fnPtr = _800127666_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(49)
    public override fun put_IsMoreTransactionHistoryLaunchable(value: Boolean): Unit {
      val fnPtr = _800127666_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(50)
    public override fun get_DisplayProperties(): IMap<String?, WalletItemCustomProperty?>? {
      val fnPtr = _800127666_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, WalletItemCustomProperty?>>()
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?,
          WalletItemCustomProperty?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(51)
    public override fun get_Verbs(): IMap<String?, WalletVerb?>? {
      val fnPtr = _800127666_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, WalletVerb?>>()
      val hr = fn.invokeHR(arrayOf(__800127666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?, WalletVerb?>>(result.getValue())
      return resultValue
    }
  }

  public class IWalletItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __800127666_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWalletItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("20b54be8118d4ec4996cb963e7bd3e74")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWalletItem(ptr: Pointer?): WithDefault = IWalletItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWalletItem {
      val address = segment.toRawLongValue()
      return makeIWalletItem(Pointer(address))
    }

    public override fun toNative(obj: IWalletItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__800127666_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWalletItem): Array<IWalletItem?> = (elements as
        Array<IWalletItem?>).castToImpl<IWalletItem,IWalletItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWalletItem?> =
        arrayOfNulls<IWalletItem_Impl>(size) as Array<IWalletItem?>
  }
}
