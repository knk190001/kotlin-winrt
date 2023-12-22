package Windows.ApplicationModel.Contacts

import Windows.System.User
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

@ABIMarker(IPinnedContactManagerStatics.ABI::class)
@Signature("{f65ccc7e-fdf9-486a-ace9-bc311d0ae7f0}")
@Guid("f65ccc7efdf9486aace9bc311d0ae7f0")
@WinRTInterface("f65ccc7efdf9486aace9bc311d0ae7f0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPinnedContactManagerStatics.ByReference::class)
public interface IPinnedContactManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): PinnedContactManager?

  @InterfaceMethod(1)
  public fun GetForUser(user: User?): PinnedContactManager?

  @InterfaceMethod(2)
  public fun IsSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPinnedContactManagerStatics> {
    public override fun getValue() = ABI.makeIPinnedContactManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IPinnedContactManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPinnedContactManagerStatics {
    public val __1357173196_Ptr: Pointer?

    public val _1357173196_VtblPtr: Pointer?
      get() = __1357173196_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): PinnedContactManager? {
      val fnPtr = _1357173196_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PinnedContactManager>()
      val hr = fn.invokeHR(arrayOf(__1357173196_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PinnedContactManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetForUser(user: User?): PinnedContactManager? {
      val fnPtr = _1357173196_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PinnedContactManager>()
      val hr = fn.invokeHR(arrayOf(__1357173196_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PinnedContactManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun IsSupported(): Boolean {
      val fnPtr = _1357173196_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1357173196_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPinnedContactManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1357173196_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPinnedContactManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f65ccc7efdf9486aace9bc311d0ae7f0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPinnedContactManagerStatics(ptr: Pointer?): WithDefault =
        IPinnedContactManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPinnedContactManagerStatics {
      val address = segment.toRawLongValue()
      return makeIPinnedContactManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IPinnedContactManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1357173196_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPinnedContactManagerStatics):
        Array<IPinnedContactManagerStatics?> = (elements as
        Array<IPinnedContactManagerStatics?>).castToImpl<IPinnedContactManagerStatics,IPinnedContactManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPinnedContactManagerStatics?> =
        arrayOfNulls<IPinnedContactManagerStatics_Impl>(size) as
        Array<IPinnedContactManagerStatics?>
  }
}
