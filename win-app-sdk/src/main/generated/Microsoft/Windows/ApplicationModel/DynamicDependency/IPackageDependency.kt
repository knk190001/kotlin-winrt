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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPackageDependency.ABI::class)
@Signature("{32ae7b95-e358-5a48-9669-c97d85ad6556}")
@Guid("32ae7b95e3585a489669c97d85ad6556")
@WinRTInterface("32ae7b95e3585a489669c97d85ad6556")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageDependency.ByReference::class)
public interface IPackageDependency : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun Delete(): Unit

  @InterfaceMethod(2)
  public fun Add(): PackageDependencyContext?

  @InterfaceMethod(3)
  public fun Add(options: AddPackageDependencyOptions?): PackageDependencyContext?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageDependency> {
    public override fun getValue() = ABI.makeIPackageDependency(pointer.getPointer(0))

    public fun setValue(value: IPackageDependency_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageDependency {
    public val __2007838056_Ptr: Pointer?

    public val _2007838056_VtblPtr: Pointer?
      get() = __2007838056_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _2007838056_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2007838056_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Delete(): Unit {
      val fnPtr = _2007838056_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2007838056_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun Add(): PackageDependencyContext? {
      val fnPtr = _2007838056_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PackageDependencyContext>()
      val hr = fn.invokeHR(arrayOf(__2007838056_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PackageDependencyContext>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun Add(options: AddPackageDependencyOptions?): PackageDependencyContext? {
      val fnPtr = _2007838056_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PackageDependencyContext>()
      val hr = fn.invokeHR(arrayOf(__2007838056_Ptr, marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PackageDependencyContext>(result.getValue())
      return resultValue
    }
  }

  public class IPackageDependency_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2007838056_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageDependency, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("32ae7b95e3585a489669c97d85ad6556")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageDependency(ptr: Pointer?): WithDefault = IPackageDependency_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageDependency {
      val address = segment.toRawLongValue()
      return makeIPackageDependency(Pointer(address))
    }

    public override fun toNative(obj: IPackageDependency): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2007838056_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageDependency): Array<IPackageDependency?> =
        (elements as
        Array<IPackageDependency?>).castToImpl<IPackageDependency,IPackageDependency_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageDependency?> =
        arrayOfNulls<IPackageDependency_Impl>(size) as Array<IPackageDependency?>
  }
}
