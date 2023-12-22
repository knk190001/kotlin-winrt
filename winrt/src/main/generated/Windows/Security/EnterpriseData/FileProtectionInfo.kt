package Windows.Security.EnterpriseData

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

@ABIMarker(FileProtectionInfo.ABI::class)
@Signature("rc(Windows.Security.EnterpriseData.FileProtectionInfo;{4ee96486-147e-4dd0-8faf-5253ed91ad0c})")
@WinRTByReference(brClass = FileProtectionInfo.ByReference::class)
public class FileProtectionInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFileProtectionInfo.WithDefault, IFileProtectionInfo2.WithDefault,
    IWinRTObject {
  private val __294366050_Interface: IFileProtectionInfo.WithDefault by lazy {
    as_294366050()
  }


  private val __535412908_Interface: IFileProtectionInfo2.WithDefault by lazy {
    as_535412908()
  }


  public override val __294366050_Ptr: JNAPointer? by lazy {
    __294366050_Interface.__294366050_Ptr
  }


  public override val __535412908_Ptr: JNAPointer? by lazy {
    __535412908_Interface.__535412908_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__294366050_Interface, __535412908_Interface)

  private fun as_294366050(): IFileProtectionInfo.WithDefault {
    if(pointer == NULL) {
      return(IFileProtectionInfo.ABI.makeIFileProtectionInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFileProtectionInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFileProtectionInfo.ABI.makeIFileProtectionInfo(ref.value))
  }

  private fun as_535412908(): IFileProtectionInfo2.WithDefault {
    if(pointer == NULL) {
      return(IFileProtectionInfo2.ABI.makeIFileProtectionInfo2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFileProtectionInfo2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFileProtectionInfo2.ABI.makeIFileProtectionInfo2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FileProtectionInfo> {
    public override fun getValue() = FileProtectionInfo(pointer.getPointer(0))

    public fun setValue(value: FileProtectionInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FileProtectionInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FileProtectionInfo {
      val address = segment.toRawLongValue()
      return FileProtectionInfo(Pointer(address))
    }

    public override fun toNative(obj: FileProtectionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
