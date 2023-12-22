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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAddPackageDependencyOptions.ABI::class)
@Signature("{01b801fd-24e3-5e6b-9f1c-805ab410b604}")
@Guid("01b801fd24e35e6b9f1c805ab410b604")
@WinRTInterface("01b801fd24e35e6b9f1c805ab410b604")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAddPackageDependencyOptions.ByReference::class)
public interface IAddPackageDependencyOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Rank(): Int

  @InterfaceMethod(1)
  public fun put_Rank(value: Int): Unit

  @InterfaceMethod(2)
  public fun get_PrependIfRankCollision(): Boolean

  @InterfaceMethod(3)
  public fun put_PrependIfRankCollision(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAddPackageDependencyOptions> {
    public override fun getValue() = ABI.makeIAddPackageDependencyOptions(pointer.getPointer(0))

    public fun setValue(value: IAddPackageDependencyOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAddPackageDependencyOptions {
    public val __767626085_Ptr: Pointer?

    public val _767626085_VtblPtr: Pointer?
      get() = __767626085_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Rank(): Int {
      val fnPtr = _767626085_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__767626085_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Rank(value: Int): Unit {
      val fnPtr = _767626085_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__767626085_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_PrependIfRankCollision(): Boolean {
      val fnPtr = _767626085_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__767626085_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_PrependIfRankCollision(value: Boolean): Unit {
      val fnPtr = _767626085_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__767626085_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAddPackageDependencyOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __767626085_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAddPackageDependencyOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("01b801fd24e35e6b9f1c805ab410b604")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAddPackageDependencyOptions(ptr: Pointer?): WithDefault =
        IAddPackageDependencyOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAddPackageDependencyOptions {
      val address = segment.toRawLongValue()
      return makeIAddPackageDependencyOptions(Pointer(address))
    }

    public override fun toNative(obj: IAddPackageDependencyOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__767626085_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAddPackageDependencyOptions):
        Array<IAddPackageDependencyOptions?> = (elements as
        Array<IAddPackageDependencyOptions?>).castToImpl<IAddPackageDependencyOptions,IAddPackageDependencyOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAddPackageDependencyOptions?> =
        arrayOfNulls<IAddPackageDependencyOptions_Impl>(size) as
        Array<IAddPackageDependencyOptions?>
  }
}
