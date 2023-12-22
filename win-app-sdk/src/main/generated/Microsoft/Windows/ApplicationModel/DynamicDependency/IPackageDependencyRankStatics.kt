package Microsoft.Windows.ApplicationModel.DynamicDependency

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPackageDependencyRankStatics.ABI::class)
@Signature("{260583bd-a4ab-53fd-a190-c446bfdb5384}")
@Guid("260583bda4ab53fda190c446bfdb5384")
@WinRTInterface("260583bda4ab53fda190c446bfdb5384")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageDependencyRankStatics.ByReference::class)
public interface IPackageDependencyRankStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Default(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageDependencyRankStatics> {
    public override fun getValue() = ABI.makeIPackageDependencyRankStatics(pointer.getPointer(0))

    public fun setValue(value: IPackageDependencyRankStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageDependencyRankStatics {
    public val __1741747343_Ptr: Pointer?

    public val _1741747343_VtblPtr: Pointer?
      get() = __1741747343_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Default(): Int {
      val fnPtr = _1741747343_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1741747343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IPackageDependencyRankStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1741747343_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageDependencyRankStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("260583bda4ab53fda190c446bfdb5384")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageDependencyRankStatics(ptr: Pointer?): WithDefault =
        IPackageDependencyRankStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageDependencyRankStatics {
      val address = segment.toRawLongValue()
      return makeIPackageDependencyRankStatics(Pointer(address))
    }

    public override fun toNative(obj: IPackageDependencyRankStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1741747343_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageDependencyRankStatics):
        Array<IPackageDependencyRankStatics?> = (elements as
        Array<IPackageDependencyRankStatics?>).castToImpl<IPackageDependencyRankStatics,IPackageDependencyRankStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageDependencyRankStatics?> =
        arrayOfNulls<IPackageDependencyRankStatics_Impl>(size) as
        Array<IPackageDependencyRankStatics?>
  }
}
