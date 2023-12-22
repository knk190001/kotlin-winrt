package Windows.Networking.Vpn

import Windows.Networking.Vpn.IVpnCustomPrompt.ABI.IID
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IVpnCustomEditBox.ABI::class)
@Signature("{3002d9a0-cfbf-4c0b-8f3c-66f503c20b39}")
@Guid("3002d9a0cfbf4c0b8f3c66f503c20b39")
@WinRTInterface("3002d9a0cfbf4c0b8f3c66f503c20b39")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnCustomEditBox.ByReference::class)
public interface IVpnCustomEditBox : NativeMapped, IWinRTInterface, IVpnCustomPrompt {
  @InterfaceMethod(0)
  public fun put_DefaultText(value: String?): Unit

  @InterfaceMethod(1)
  public fun get_DefaultText(): String?

  @InterfaceMethod(2)
  public fun put_NoEcho(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_NoEcho(): Boolean

  @InterfaceMethod(4)
  public fun get_Text(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnCustomEditBox> {
    public override fun getValue() = ABI.makeIVpnCustomEditBox(pointer.getPointer(0))

    public fun setValue(value: IVpnCustomEditBox_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnCustomEditBox, IVpnCustomPrompt.WithDefault {
    public val __1412312384_Ptr: Pointer?

    public val _1412312384_VtblPtr: Pointer?
      get() = __1412312384_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_DefaultText(value: String?): Unit {
      val fnPtr = _1412312384_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1412312384_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_DefaultText(): String? {
      val fnPtr = _1412312384_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1412312384_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_NoEcho(value: Boolean): Unit {
      val fnPtr = _1412312384_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1412312384_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_NoEcho(): Boolean {
      val fnPtr = _1412312384_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1412312384_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_Text(): String? {
      val fnPtr = _1412312384_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1412312384_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IVpnCustomEditBox_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IVpnCustomPrompt {
    public override val __235034533_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1412312384_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1412312384_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnCustomEditBox, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3002d9a0cfbf4c0b8f3c66f503c20b39")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnCustomEditBox(ptr: Pointer?): WithDefault = IVpnCustomEditBox_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnCustomEditBox {
      val address = segment.toRawLongValue()
      return makeIVpnCustomEditBox(Pointer(address))
    }

    public override fun toNative(obj: IVpnCustomEditBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1412312384_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnCustomEditBox): Array<IVpnCustomEditBox?> = (elements
        as Array<IVpnCustomEditBox?>).castToImpl<IVpnCustomEditBox,IVpnCustomEditBox_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnCustomEditBox?> =
        arrayOfNulls<IVpnCustomEditBox_Impl>(size) as Array<IVpnCustomEditBox?>
  }
}
