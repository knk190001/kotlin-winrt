package Windows.ApplicationModel.Wallet

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

@ABIMarker(IWalletItemCustomProperty.ABI::class)
@Signature("{b94b40f3-fa00-40fd-98dc-9de46697f1e7}")
@Guid("b94b40f3fa0040fd98dc9de46697f1e7")
@WinRTInterface("b94b40f3fa0040fd98dc9de46697f1e7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWalletItemCustomProperty.ByReference::class)
public interface IWalletItemCustomProperty : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun put_Name(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Value(): String?

  @InterfaceMethod(3)
  public fun put_Value(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_AutoDetectLinks(): Boolean

  @InterfaceMethod(5)
  public fun put_AutoDetectLinks(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_DetailViewPosition(): WalletDetailViewPosition?

  @InterfaceMethod(7)
  public fun put_DetailViewPosition(value: WalletDetailViewPosition?): Unit

  @InterfaceMethod(8)
  public fun get_SummaryViewPosition(): WalletSummaryViewPosition?

  @InterfaceMethod(9)
  public fun put_SummaryViewPosition(value: WalletSummaryViewPosition?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWalletItemCustomProperty> {
    public override fun getValue() = ABI.makeIWalletItemCustomProperty(pointer.getPointer(0))

    public fun setValue(value: IWalletItemCustomProperty_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWalletItemCustomProperty {
    public val __1660750920_Ptr: Pointer?

    public val _1660750920_VtblPtr: Pointer?
      get() = __1660750920_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _1660750920_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1660750920_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Name(value: String?): Unit {
      val fnPtr = _1660750920_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1660750920_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Value(): String? {
      val fnPtr = _1660750920_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1660750920_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Value(value: String?): Unit {
      val fnPtr = _1660750920_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1660750920_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_AutoDetectLinks(): Boolean {
      val fnPtr = _1660750920_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1660750920_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_AutoDetectLinks(value: Boolean): Unit {
      val fnPtr = _1660750920_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1660750920_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_DetailViewPosition(): WalletDetailViewPosition? {
      val fnPtr = _1660750920_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WalletDetailViewPosition>()
      val hr = fn.invokeHR(arrayOf(__1660750920_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WalletDetailViewPosition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_DetailViewPosition(value: WalletDetailViewPosition?): Unit {
      val fnPtr = _1660750920_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1660750920_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_SummaryViewPosition(): WalletSummaryViewPosition? {
      val fnPtr = _1660750920_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WalletSummaryViewPosition>()
      val hr = fn.invokeHR(arrayOf(__1660750920_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WalletSummaryViewPosition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_SummaryViewPosition(value: WalletSummaryViewPosition?): Unit {
      val fnPtr = _1660750920_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1660750920_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWalletItemCustomProperty_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1660750920_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWalletItemCustomProperty, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b94b40f3fa0040fd98dc9de46697f1e7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWalletItemCustomProperty(ptr: Pointer?): WithDefault =
        IWalletItemCustomProperty_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWalletItemCustomProperty {
      val address = segment.toRawLongValue()
      return makeIWalletItemCustomProperty(Pointer(address))
    }

    public override fun toNative(obj: IWalletItemCustomProperty): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1660750920_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWalletItemCustomProperty):
        Array<IWalletItemCustomProperty?> = (elements as
        Array<IWalletItemCustomProperty?>).castToImpl<IWalletItemCustomProperty,IWalletItemCustomProperty_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWalletItemCustomProperty?> =
        arrayOfNulls<IWalletItemCustomProperty_Impl>(size) as Array<IWalletItemCustomProperty?>
  }
}
