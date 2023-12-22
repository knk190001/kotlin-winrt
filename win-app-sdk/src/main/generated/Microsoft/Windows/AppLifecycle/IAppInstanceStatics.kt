package Microsoft.Windows.AppLifecycle

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IAppInstanceStatics.ABI::class)
@Signature("{4f414b25-8330-5a9b-bbc1-8229d479649d}")
@Guid("4f414b2583305a9bbbc18229d479649d")
@WinRTInterface("4f414b2583305a9bbbc18229d479649d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppInstanceStatics.ByReference::class)
public interface IAppInstanceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCurrent(): AppInstance?

  @InterfaceMethod(1)
  public fun GetInstances(): IVector<AppInstance?>?

  @InterfaceMethod(2)
  public fun FindOrRegisterForKey(key: String?): AppInstance?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppInstanceStatics> {
    public override fun getValue() = ABI.makeIAppInstanceStatics(pointer.getPointer(0))

    public fun setValue(value: IAppInstanceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppInstanceStatics {
    public val __1362552708_Ptr: Pointer?

    public val _1362552708_VtblPtr: Pointer?
      get() = __1362552708_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCurrent(): AppInstance? {
      val fnPtr = _1362552708_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppInstance>()
      val hr = fn.invokeHR(arrayOf(__1362552708_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppInstance>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetInstances(): IVector<AppInstance?>? {
      val fnPtr = _1362552708_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<AppInstance?>>()
      val hr = fn.invokeHR(arrayOf(__1362552708_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<AppInstance?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FindOrRegisterForKey(key: String?): AppInstance? {
      val fnPtr = _1362552708_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppInstance>()
      val hr = fn.invokeHR(arrayOf(__1362552708_Ptr, marshalToNative(key), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppInstance>(result.getValue())
      return resultValue
    }
  }

  public class IAppInstanceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1362552708_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppInstanceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4f414b2583305a9bbbc18229d479649d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppInstanceStatics(ptr: Pointer?): WithDefault = IAppInstanceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppInstanceStatics {
      val address = segment.toRawLongValue()
      return makeIAppInstanceStatics(Pointer(address))
    }

    public override fun toNative(obj: IAppInstanceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1362552708_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInstanceStatics): Array<IAppInstanceStatics?> =
        (elements as
        Array<IAppInstanceStatics?>).castToImpl<IAppInstanceStatics,IAppInstanceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInstanceStatics?> =
        arrayOfNulls<IAppInstanceStatics_Impl>(size) as Array<IAppInstanceStatics?>
  }
}
