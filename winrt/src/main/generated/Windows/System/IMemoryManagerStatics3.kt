package Windows.System

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

@ABIMarker(IMemoryManagerStatics3.ABI::class)
@Signature("{149b59ce-92ad-4e35-89eb-50dfb4c0d91c}")
@Guid("149b59ce92ad4e3589eb50dfb4c0d91c")
@WinRTInterface("149b59ce92ad4e3589eb50dfb4c0d91c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMemoryManagerStatics3.ByReference::class)
public interface IMemoryManagerStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TrySetAppMemoryUsageLimit(value: WinDef.ULONG): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMemoryManagerStatics3> {
    public override fun getValue() = ABI.makeIMemoryManagerStatics3(pointer.getPointer(0))

    public fun setValue(value: IMemoryManagerStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMemoryManagerStatics3 {
    public val __144428171_Ptr: Pointer?

    public val _144428171_VtblPtr: Pointer?
      get() = __144428171_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TrySetAppMemoryUsageLimit(value: WinDef.ULONG): Boolean {
      val fnPtr = _144428171_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__144428171_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IMemoryManagerStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __144428171_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMemoryManagerStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("149b59ce92ad4e3589eb50dfb4c0d91c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMemoryManagerStatics3(ptr: Pointer?): WithDefault =
        IMemoryManagerStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMemoryManagerStatics3 {
      val address = segment.toRawLongValue()
      return makeIMemoryManagerStatics3(Pointer(address))
    }

    public override fun toNative(obj: IMemoryManagerStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__144428171_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMemoryManagerStatics3): Array<IMemoryManagerStatics3?> =
        (elements as
        Array<IMemoryManagerStatics3?>).castToImpl<IMemoryManagerStatics3,IMemoryManagerStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMemoryManagerStatics3?> =
        arrayOfNulls<IMemoryManagerStatics3_Impl>(size) as Array<IMemoryManagerStatics3?>
  }
}
