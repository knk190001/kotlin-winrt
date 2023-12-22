package Windows.Media.Devices.Core

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IFrameFocusCapabilities.ABI::class)
@Signature("{7b25cd58-01c0-4065-9c40-c1a721425c1a}")
@Guid("7b25cd5801c040659c40c1a721425c1a")
@WinRTInterface("7b25cd5801c040659c40c1a721425c1a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameFocusCapabilities.ByReference::class)
public interface IFrameFocusCapabilities : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Supported(): Boolean

  @InterfaceMethod(1)
  public fun get_Min(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_Max(): WinDef.UINT

  @InterfaceMethod(3)
  public fun get_Step(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameFocusCapabilities> {
    public override fun getValue() = ABI.makeIFrameFocusCapabilities(pointer.getPointer(0))

    public fun setValue(value: IFrameFocusCapabilities_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameFocusCapabilities {
    public val __1860887771_Ptr: Pointer?

    public val _1860887771_VtblPtr: Pointer?
      get() = __1860887771_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Supported(): Boolean {
      val fnPtr = _1860887771_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1860887771_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Min(): WinDef.UINT {
      val fnPtr = _1860887771_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1860887771_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Max(): WinDef.UINT {
      val fnPtr = _1860887771_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1860887771_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Step(): WinDef.UINT {
      val fnPtr = _1860887771_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1860887771_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IFrameFocusCapabilities_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1860887771_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameFocusCapabilities, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7b25cd5801c040659c40c1a721425c1a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameFocusCapabilities(ptr: Pointer?): WithDefault =
        IFrameFocusCapabilities_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameFocusCapabilities {
      val address = segment.toRawLongValue()
      return makeIFrameFocusCapabilities(Pointer(address))
    }

    public override fun toNative(obj: IFrameFocusCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1860887771_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameFocusCapabilities): Array<IFrameFocusCapabilities?>
        = (elements as
        Array<IFrameFocusCapabilities?>).castToImpl<IFrameFocusCapabilities,IFrameFocusCapabilities_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameFocusCapabilities?> =
        arrayOfNulls<IFrameFocusCapabilities_Impl>(size) as Array<IFrameFocusCapabilities?>
  }
}
