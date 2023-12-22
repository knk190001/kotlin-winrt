package Windows.Devices.AllJoyn

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAllJoynServiceInfo.ABI::class)
@Signature("{4cbe8209-b93e-4182-999b-ddd000f9c575}")
@Guid("4cbe8209b93e4182999bddd000f9c575")
@WinRTInterface("4cbe8209b93e4182999bddd000f9c575")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynServiceInfo.ByReference::class)
public interface IAllJoynServiceInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UniqueName(): String?

  @InterfaceMethod(1)
  public fun get_ObjectPath(): String?

  @InterfaceMethod(2)
  public fun get_SessionPort(): WinDef.USHORT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynServiceInfo> {
    public override fun getValue() = ABI.makeIAllJoynServiceInfo(pointer.getPointer(0))

    public fun setValue(value: IAllJoynServiceInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynServiceInfo {
    public val __435459854_Ptr: Pointer?

    public val _435459854_VtblPtr: Pointer?
      get() = __435459854_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UniqueName(): String? {
      val fnPtr = _435459854_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__435459854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ObjectPath(): String? {
      val fnPtr = _435459854_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__435459854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SessionPort(): WinDef.USHORT {
      val fnPtr = _435459854_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__435459854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }
  }

  public class IAllJoynServiceInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __435459854_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynServiceInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4cbe8209b93e4182999bddd000f9c575")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynServiceInfo(ptr: Pointer?): WithDefault = IAllJoynServiceInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAllJoynServiceInfo {
      val address = segment.toRawLongValue()
      return makeIAllJoynServiceInfo(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynServiceInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__435459854_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynServiceInfo): Array<IAllJoynServiceInfo?> =
        (elements as
        Array<IAllJoynServiceInfo?>).castToImpl<IAllJoynServiceInfo,IAllJoynServiceInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynServiceInfo?> =
        arrayOfNulls<IAllJoynServiceInfo_Impl>(size) as Array<IAllJoynServiceInfo?>
  }
}
