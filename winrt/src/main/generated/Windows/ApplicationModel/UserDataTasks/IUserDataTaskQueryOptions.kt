package Windows.ApplicationModel.UserDataTasks

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

@ABIMarker(IUserDataTaskQueryOptions.ABI::class)
@Signature("{959f27ed-909a-4d30-8c1b-331d8fe667e2}")
@Guid("959f27ed909a4d308c1b331d8fe667e2")
@WinRTInterface("959f27ed909a4d308c1b331d8fe667e2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataTaskQueryOptions.ByReference::class)
public interface IUserDataTaskQueryOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SortProperty(): UserDataTaskQuerySortProperty?

  @InterfaceMethod(1)
  public fun put_SortProperty(value: UserDataTaskQuerySortProperty?): Unit

  @InterfaceMethod(2)
  public fun get_Kind(): UserDataTaskQueryKind?

  @InterfaceMethod(3)
  public fun put_Kind(value: UserDataTaskQueryKind?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataTaskQueryOptions> {
    public override fun getValue() = ABI.makeIUserDataTaskQueryOptions(pointer.getPointer(0))

    public fun setValue(value: IUserDataTaskQueryOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataTaskQueryOptions {
    public val __1710134634_Ptr: Pointer?

    public val _1710134634_VtblPtr: Pointer?
      get() = __1710134634_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SortProperty(): UserDataTaskQuerySortProperty? {
      val fnPtr = _1710134634_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataTaskQuerySortProperty>()
      val hr = fn.invokeHR(arrayOf(__1710134634_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataTaskQuerySortProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SortProperty(value: UserDataTaskQuerySortProperty?): Unit {
      val fnPtr = _1710134634_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1710134634_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Kind(): UserDataTaskQueryKind? {
      val fnPtr = _1710134634_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataTaskQueryKind>()
      val hr = fn.invokeHR(arrayOf(__1710134634_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataTaskQueryKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Kind(value: UserDataTaskQueryKind?): Unit {
      val fnPtr = _1710134634_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1710134634_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUserDataTaskQueryOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1710134634_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataTaskQueryOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("959f27ed909a4d308c1b331d8fe667e2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataTaskQueryOptions(ptr: Pointer?): WithDefault =
        IUserDataTaskQueryOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataTaskQueryOptions {
      val address = segment.toRawLongValue()
      return makeIUserDataTaskQueryOptions(Pointer(address))
    }

    public override fun toNative(obj: IUserDataTaskQueryOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1710134634_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataTaskQueryOptions):
        Array<IUserDataTaskQueryOptions?> = (elements as
        Array<IUserDataTaskQueryOptions?>).castToImpl<IUserDataTaskQueryOptions,IUserDataTaskQueryOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataTaskQueryOptions?> =
        arrayOfNulls<IUserDataTaskQueryOptions_Impl>(size) as Array<IUserDataTaskQueryOptions?>
  }
}
