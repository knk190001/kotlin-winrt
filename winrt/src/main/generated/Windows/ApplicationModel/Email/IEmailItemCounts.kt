package Windows.ApplicationModel.Email

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IEmailItemCounts.ABI::class)
@Signature("{5bd13321-fec8-4bab-83ba-0baf3c1f6cbd}")
@Guid("5bd13321fec84bab83ba0baf3c1f6cbd")
@WinRTInterface("5bd13321fec84bab83ba0baf3c1f6cbd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailItemCounts.ByReference::class)
public interface IEmailItemCounts : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Flagged(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_Important(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_Total(): WinDef.UINT

  @InterfaceMethod(3)
  public fun get_Unread(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailItemCounts> {
    public override fun getValue() = ABI.makeIEmailItemCounts(pointer.getPointer(0))

    public fun setValue(value: IEmailItemCounts_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailItemCounts {
    public val __1383466884_Ptr: Pointer?

    public val _1383466884_VtblPtr: Pointer?
      get() = __1383466884_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Flagged(): WinDef.UINT {
      val fnPtr = _1383466884_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1383466884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Important(): WinDef.UINT {
      val fnPtr = _1383466884_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1383466884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Total(): WinDef.UINT {
      val fnPtr = _1383466884_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1383466884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Unread(): WinDef.UINT {
      val fnPtr = _1383466884_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1383466884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IEmailItemCounts_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1383466884_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailItemCounts, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5bd13321fec84bab83ba0baf3c1f6cbd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailItemCounts(ptr: Pointer?): WithDefault = IEmailItemCounts_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailItemCounts {
      val address = segment.toRawLongValue()
      return makeIEmailItemCounts(Pointer(address))
    }

    public override fun toNative(obj: IEmailItemCounts): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1383466884_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailItemCounts): Array<IEmailItemCounts?> = (elements as
        Array<IEmailItemCounts?>).castToImpl<IEmailItemCounts,IEmailItemCounts_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailItemCounts?> =
        arrayOfNulls<IEmailItemCounts_Impl>(size) as Array<IEmailItemCounts?>
  }
}
