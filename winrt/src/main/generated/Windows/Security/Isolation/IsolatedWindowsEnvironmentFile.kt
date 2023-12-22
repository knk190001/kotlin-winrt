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

@ABIMarker(IsolatedWindowsEnvironmentFile.ABI::class)
@Signature("rc(Windows.Security.Isolation.IsolatedWindowsEnvironmentFile;{4d5ae1ef-029f-4101-8c35-fe91bf9cd5f0})")
@WinRTByReference(brClass = IsolatedWindowsEnvironmentFile.ByReference::class)
public class IsolatedWindowsEnvironmentFile(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIsolatedWindowsEnvironmentFile.WithDefault,
    IIsolatedWindowsEnvironmentFile2.WithDefault, IWinRTObject {
  private val __1941126173_Interface: IIsolatedWindowsEnvironmentFile.WithDefault by lazy {
    as_1941126173()
  }


  private val __45369169_Interface: IIsolatedWindowsEnvironmentFile2.WithDefault by lazy {
    as_45369169()
  }


  public override val __1941126173_Ptr: JNAPointer? by lazy {
    __1941126173_Interface.__1941126173_Ptr
  }


  public override val __45369169_Ptr: JNAPointer? by lazy {
    __45369169_Interface.__45369169_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1941126173_Interface, __45369169_Interface)

  private fun as_1941126173(): IIsolatedWindowsEnvironmentFile.WithDefault {
    if(pointer == NULL) {
      return(IIsolatedWindowsEnvironmentFile.ABI.makeIIsolatedWindowsEnvironmentFile(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIsolatedWindowsEnvironmentFile>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIsolatedWindowsEnvironmentFile.ABI.makeIIsolatedWindowsEnvironmentFile(ref.value))
  }

  private fun as_45369169(): IIsolatedWindowsEnvironmentFile2.WithDefault {
    if(pointer == NULL) {
      return(IIsolatedWindowsEnvironmentFile2.ABI.makeIIsolatedWindowsEnvironmentFile2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIsolatedWindowsEnvironmentFile2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIsolatedWindowsEnvironmentFile2.ABI.makeIIsolatedWindowsEnvironmentFile2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IsolatedWindowsEnvironmentFile> {
    public override fun getValue() = IsolatedWindowsEnvironmentFile(pointer.getPointer(0))

    public fun setValue(value: IsolatedWindowsEnvironmentFile): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IsolatedWindowsEnvironmentFile, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): IsolatedWindowsEnvironmentFile {
      val address = segment.toRawLongValue()
      return IsolatedWindowsEnvironmentFile(Pointer(address))
    }

    public override fun toNative(obj: IsolatedWindowsEnvironmentFile): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
