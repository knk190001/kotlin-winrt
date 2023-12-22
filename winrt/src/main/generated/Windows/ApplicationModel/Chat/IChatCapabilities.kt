package Windows.ApplicationModel.Chat

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IChatCapabilities.ABI::class)
@Signature("{3aff77bc-39c9-4dd1-ad2d-3964dd9d403f}")
@Guid("3aff77bc39c94dd1ad2d3964dd9d403f")
@WinRTInterface("3aff77bc39c94dd1ad2d3964dd9d403f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatCapabilities.ByReference::class)
public interface IChatCapabilities : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsOnline(): Boolean

  @InterfaceMethod(1)
  public fun get_IsChatCapable(): Boolean

  @InterfaceMethod(2)
  public fun get_IsFileTransferCapable(): Boolean

  @InterfaceMethod(3)
  public fun get_IsGeoLocationPushCapable(): Boolean

  @InterfaceMethod(4)
  public fun get_IsIntegratedMessagingCapable(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatCapabilities> {
    public override fun getValue() = ABI.makeIChatCapabilities(pointer.getPointer(0))

    public fun setValue(value: IChatCapabilities_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatCapabilities {
    public val __2087813813_Ptr: Pointer?

    public val _2087813813_VtblPtr: Pointer?
      get() = __2087813813_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsOnline(): Boolean {
      val fnPtr = _2087813813_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2087813813_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsChatCapable(): Boolean {
      val fnPtr = _2087813813_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2087813813_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsFileTransferCapable(): Boolean {
      val fnPtr = _2087813813_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2087813813_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsGeoLocationPushCapable(): Boolean {
      val fnPtr = _2087813813_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2087813813_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_IsIntegratedMessagingCapable(): Boolean {
      val fnPtr = _2087813813_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2087813813_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IChatCapabilities_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2087813813_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatCapabilities, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3aff77bc39c94dd1ad2d3964dd9d403f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatCapabilities(ptr: Pointer?): WithDefault = IChatCapabilities_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatCapabilities {
      val address = segment.toRawLongValue()
      return makeIChatCapabilities(Pointer(address))
    }

    public override fun toNative(obj: IChatCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2087813813_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatCapabilities): Array<IChatCapabilities?> = (elements
        as Array<IChatCapabilities?>).castToImpl<IChatCapabilities,IChatCapabilities_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatCapabilities?> =
        arrayOfNulls<IChatCapabilities_Impl>(size) as Array<IChatCapabilities?>
  }
}
