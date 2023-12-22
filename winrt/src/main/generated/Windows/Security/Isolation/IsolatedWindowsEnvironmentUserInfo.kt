package Windows.Security.Isolation

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(IsolatedWindowsEnvironmentUserInfo.ABI::class)
@Signature("rc(Windows.Security.Isolation.IsolatedWindowsEnvironmentUserInfo;{8a9c75ae-69ba-4001-96fc-19a02703b340})")
@WinRTByReference(brClass = IsolatedWindowsEnvironmentUserInfo.ByReference::class)
public class IsolatedWindowsEnvironmentUserInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIsolatedWindowsEnvironmentUserInfo.WithDefault, IWinRTObject {
  private val __1791633920_Interface: IIsolatedWindowsEnvironmentUserInfo.WithDefault by lazy {
    as_1791633920()
  }


  public override val __1791633920_Ptr: JNAPointer? by lazy {
    __1791633920_Interface.__1791633920_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1791633920_Interface)

  private fun as_1791633920(): IIsolatedWindowsEnvironmentUserInfo.WithDefault {
    if(pointer == NULL) {
      return(IIsolatedWindowsEnvironmentUserInfo.ABI.makeIIsolatedWindowsEnvironmentUserInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIsolatedWindowsEnvironmentUserInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIsolatedWindowsEnvironmentUserInfo.ABI.makeIIsolatedWindowsEnvironmentUserInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IsolatedWindowsEnvironmentUserInfo> {
    public override fun getValue() = IsolatedWindowsEnvironmentUserInfo(pointer.getPointer(0))

    public fun setValue(value: IsolatedWindowsEnvironmentUserInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IsolatedWindowsEnvironmentUserInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): IsolatedWindowsEnvironmentUserInfo {
      val address = segment.toRawLongValue()
      return IsolatedWindowsEnvironmentUserInfo(Pointer(address))
    }

    public override fun toNative(obj: IsolatedWindowsEnvironmentUserInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
